package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.BasicClassDri.SuperService;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.mapper.SysResourcesMapper;
import com.zhaols.SSMdome.service.ISysResourcesService;
import com.zhaols.SSMdome.utils.ResponseBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-25 16:49
 */
@Service
public class SysResourcesService extends SuperService<SysResources> implements ISysResourcesService {
    @Autowired
    private SysResourcesMapper resourcesMapper;

    @Override
    protected IEntityMapper<SysResources> getDao() {
        return resourcesMapper;
    }

    @Override
    public List<SysResources> queryResByUid(String userId) {
        return resourcesMapper.queryResByUid(userId);
    }

    @Override
    public List<SysResources> queryResByRid(String roleId) {
        return resourcesMapper.queryResByRid(roleId);
    }

    @Override
    public void updateAuth(String roleId, String selectBeforeRes, String selectAfterRes) {
        //取消所有权限
        if(StringUtils.isNotEmpty(selectBeforeRes)){
            String[] befores = selectBeforeRes.split(",");
            clncelAuth(roleId, Arrays.asList(befores));
        }

        if(StringUtils.isNotEmpty(selectAfterRes)) {
            String[] afters = selectAfterRes.split(",");
            //添加新权限
            for (String resId : afters) {
                Map<String, String> map = new HashMap<>();
                map.put("roleId", roleId);
                map.put("resId", resId);
                resourcesMapper.addAuth(map);

            }
        }
    }

    public void clncelAuth(String roleId,List<String> resList){
        if(resList != null && resList.size() > 0){
            for (String s :resList ) {
                Map<String,String> map = new HashMap<>();
                map.put("roleId",roleId);
                map.put("resId",s);
                resourcesMapper.clncelAuth(map);
            }
        }

    }
}

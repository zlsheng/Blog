package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.BasicClassDri.SuperService;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.mapper.SysResourcesMapper;
import com.zhaols.SSMdome.service.ISysResourcesService;
import com.zhaols.SSMdome.utils.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}

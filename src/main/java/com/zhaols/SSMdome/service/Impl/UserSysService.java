package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.mapper.SysResourcesMapper;
import com.zhaols.SSMdome.mapper.SysUserMapper;
import com.zhaols.SSMdome.service.IUserSysService;
import com.zhaols.SSMdome.utils.CommonUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-20 14:16
 */
@Service
public class UserSysService implements IUserSysService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    public SysUser getUserById(String id) throws Exception{
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysUser> getUserList() {
        return sysUserMapper.getAll();
    }

    @Override
    public void saveAndUpdate(SysUser entity) {
        if(StringUtils.isNotEmpty(entity.getuId())){
            //编辑
            entity.updateEntity();
            sysUserMapper.updateByPrimaryKeySelective(entity);
        }else {
            //新增
            entity.setuId(CommonUtils.getUUID());
            entity.setuSalt(entity.getuId());
            entity.createEntity();
            entity.setuPassword(CommonUtils.MD5(entity.getuPassword(),entity.getuSalt()));
            sysUserMapper.insertSelective(entity);
        }

    }

    @Override
    public void deleteUser(String id) {
        sysUserMapper.deleteByPrimaryKey(id);
    }
}

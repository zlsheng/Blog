package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.mapper.SysResourcesMapper;
import com.zhaols.SSMdome.mapper.SysUserMapper;
import com.zhaols.SSMdome.service.IUserSysService;
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
}

package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.entity.SysRole1;
import com.zhaols.SSMdome.mapper.SysRoleMapper;
import com.zhaols.SSMdome.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-20 16:18
 */
@Service
public class RoleService implements IRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole1> getAll() {
        return sysRoleMapper.getAll();
    }
}

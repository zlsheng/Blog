package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.BasicClassDri.BasicAction;
import com.zhaols.SSMdome.entity.SysRole;
import com.zhaols.SSMdome.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-20 16:16
 */
public class RoleAction extends BasicAction<SysRole,IRoleService> {
    @Autowired
    private IRoleService roleService;
    private List<SysRole> roles;

    @Override
    public String list(){
        roles = roleService.queryRole();
        return super.list();
    }

    @Override
    protected IRoleService getEntityManager() {
        return roleService;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}

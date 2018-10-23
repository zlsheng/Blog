package com.zhaols.SSMdome.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-21 10:35
 */
public class ActiveUser implements Serializable {
    private static final long serialVersionUID = 1L;
    //用户id（主键）
    private String userid;
    // 用户账号
    private String userCode;
    // 用户名称
    private String username;
    // 菜单
    private List<SysResources> menus;
    // 权限
    private List<SysResources> permissions;
    // 权限
    private List<SysResources> resourceList;
    private String loginIp;
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<SysResources> getMenus() {
        return menus;
    }

    public void setMenus(List<SysResources> menus) {
        this.menus = menus;
    }

    public List<SysResources> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysResources> permissions) {
        this.permissions = permissions;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public List<SysResources> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<SysResources> resourceList) {
        this.resourceList = resourceList;
    }
}

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
    private String userid;//用户id（主键）
    private String userCode;// 用户账号
    private String username;// 用户名称

    private List<SysResources> menus;// 菜单
    private List<SysResources> permissions;// 权限

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
}

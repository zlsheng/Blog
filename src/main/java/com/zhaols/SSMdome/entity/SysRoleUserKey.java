package com.zhaols.SSMdome.entity;

public class SysRoleUserKey {
    /**
     * 博主id
     */
    private String userId;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 博主id
     * @return USER_ID 博主id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 博主id
     * @param userId 博主id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 角色id
     * @return ROLE_ID 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * @param roleId 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}
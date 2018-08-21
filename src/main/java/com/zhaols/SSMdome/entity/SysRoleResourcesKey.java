package com.zhaols.SSMdome.entity;

public class SysRoleResourcesKey {
    /**
     * 角色ID
     */
    private String roleId;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 角色ID
     * @return ROLE_ID 角色ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 角色ID
     * @param roleId 角色ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 资源id
     * @return RESOURCE_ID 资源id
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 资源id
     * @param resourceId 资源id
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }
}
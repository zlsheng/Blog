package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.BasicClassDri.BasicAction;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.entity.SysRole;
import com.zhaols.SSMdome.service.IRoleService;
import com.zhaols.SSMdome.service.ISysResourcesService;
import com.zhaols.SSMdome.utils.ResponseBean;
import com.zhaols.SSMdome.utils.Result;
import org.apache.commons.lang3.StringUtils;
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
    @Autowired
    private ISysResourcesService sysResourcesService;
    private List<SysRole> roles;

    private String type;
    //所有的资源信息列表
    private List<SysResources> resources;

    @Override
    public String list(){
        roles = roleService.queryRole();
        return super.list();
    }

    public String toViewRole(){
        String id =  getHttpServletRequest().getParameter("id");
        if(StringUtils.isNotEmpty(id)){
            entity = roleService.get(id);
        }
        return "toViewRole";
    }
    public String saveAndUpdate(){
        if(StringUtils.isNotEmpty(entity.getId())){
            SysRole role = roleService.queryRoleByCode(entity.getCode());
            if(role != null){
                result = new Result(false,"角色编码已存在，请重新填写");
            }
            try{
                roleService.saveAndUpdate(entity);
                result = new Result(true,"编辑成功");

            }catch(Exception e ){
                e.printStackTrace();
                result = new Result(false,"编辑失败，请联系管理员");
            }
        }else {
            try{
                roleService.saveAndUpdate(entity);
                result = new Result(true,"新增成功");

            }catch(Exception e ){
                e.printStackTrace();
                result = new Result(false,"新增失败，请联系管理员");
            }
        }
        return RESULT;
    }
    public String deleteRole(){
        String id = getHttpServletRequest().getParameter("id");
        if (StringUtils.isNotEmpty(id)){
            roleService.deleteRole(id);
            result = new Result(true,"角色删除成功");
        }else {
            result = new Result(false,"操作异常，请联系管理员");
        }
        return RESULT;
    }

    public String changeEnable(){
        String isEnable = getHttpServletRequest().getParameter("isEnable");
        String id = getHttpServletRequest().getParameter("id");
        String message = "禁用成功";
        if("11".equals(isEnable)){
            message = "启用成功";
        }
        try{
            roleService.updateRoleEnable(id,isEnable);
            result = new Result(true,message);
        }catch(Exception e ) {
            e.printStackTrace();
            result = new Result(true,"操作失败，请联系管理员");
        }
        return RESULT;
    }
    public String toAuthor(){
        resources =  sysResourcesService.getAll();
        return "toAuthor";
    }
    /**
     *@Description 递归查询所有资源列表
     *@Author: zhaols
     *@param pId    父资源id
     *@param resources 所有资源列表
     *@Return: com.zhaols.SSMdome.utils.ResponseBean
     *@CreateTime: 2018-09-25  17:26
     */
    private ResponseBean getResourcesTree(String pId,List<SysResources> resources) {
        if(resources != null && resources.size() > 0){
            if (StringUtils.isEmpty(pId)) {
                for (SysResources s1 : resources) {
                    if (StringUtils.isEmpty(s1.getParentCode())) {
                        ResponseBean responseBean1 = ResponseBean.getResponseBeanJson(s1.getDisplay(), true, getResourcesTree(s1.getId(), resources), false, false);
                    }
                }
            }
        }
        ResponseBean responseBean = new ResponseBean();
        return responseBean;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SysResources> getResources() {
        return resources;
    }

    public void setResources(List<SysResources> resources) {
        this.resources = resources;
    }
}

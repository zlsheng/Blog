package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.BasicClassDri.BasicAction;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.entity.SysRole;
import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.service.IRoleService;
import com.zhaols.SSMdome.service.ISysResourcesService;
import com.zhaols.SSMdome.service.IUserSysService;
import com.zhaols.SSMdome.utils.ResponseBean;
import com.zhaols.SSMdome.utils.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.alibaba.fastjson.JSON.toJSONString;

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
    @Autowired
    private IUserSysService userSysService;
    private List<SysRole> roles;
    private String userId;
    private String roleId;
    private String type;
    //所有的资源信息列表
    private List<SysResources> resources;
    //权限Ztree使用
    private List<ResponseBean> resourceList;
    //角色所拥有之前的权限
    private String selectBeforeRes = "";
    //角色授权操作后所拥有的权限
    private String selectAfterRes = "";
    @Override
    public String list(){
        roles = roleService.queryRole();
        return super.list();
    }

    /**
     *@Description  跳转新增、编辑方法
     *@Author: zhaols
     *@param
     *@Return: java.lang.String
     *@CreateTime: 2018-09-26  11:04
     */
    public String toViewRole(){
        String id =  getHttpServletRequest().getParameter("id");
        if(StringUtils.isNotEmpty(id)){
            entity = roleService.get(id);
        }
        return "toViewRole";
    }
    /**
     *@Description  保存或更新
     *@Author: zhaols
     *@param
     *@Return: java.lang.String
     *@CreateTime: 2018-09-26  11:04
     */
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
    /**
     *@Description 删除角色
     *@Author: zhaols
     *@param
     *@Return: java.lang.String
     *@CreateTime: 2018-09-26  11:04
     */
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

    /**
     *@Description  修改角色状态
     *@Author: zhaols
     *@param
     *@Return: java.lang.String
     *@CreateTime: 2018-09-26  11:04
     */
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
   /**
    *@Description: 跳转授权页面
    *@Author: zhaols
    *@param 
    *@Return: java.lang.String
    *@CreateTime: 2018-09-26  11:08
    */
    public String toAuthor(){
        roleId = getHttpServletRequest().getParameter("id");
        List<SysResources> userHavRes = sysResourcesService.queryResByRid(roleId);
        if (userHavRes != null && userHavRes.size() > 0){
            for (SysResources r:userHavRes){
                selectBeforeRes += r.getId() + ",";
            }
            if (selectBeforeRes.contains(",")){
                selectBeforeRes = selectBeforeRes.substring(0,selectBeforeRes.length() - 1);
            }
        }
        return "toAuthor";
    }
    /**
     *@Description: 获取权限列表
     *@Author: zhaols
     *@param 
     *@Return: java.lang.String
     *@CreateTime: 2018-09-26  11:21
     */
    public String queryResouresList(){
        roleId = getHttpServletRequest().getParameter("roleId");
        List<SysResources> userHavRes = sysResourcesService.queryResByRid(roleId);
        if (userHavRes != null && userHavRes.size() > 0){
            for (SysResources r:userHavRes){
                selectBeforeRes += r.getId() + ",";
            }
            if (selectBeforeRes.contains(",")){
                selectBeforeRes = selectBeforeRes.substring(0,selectBeforeRes.length() - 1);
            }
        }
        resources =  sysResourcesService.getAll();
        resourceList = new ArrayList<>();
        if (resources != null && resources.size() > 0){
            for (SysResources res : resources){
                if (res.getParentCode() == null){
                    resourceList.add(ResponseBean.getResponseBeanJson(res.getDisplay(),false,getResourcesSonTree(res.getId(),resources,userHavRes),false,false,res.getId()));
                }
            }
        }
        return "json";
    }
    /**
     *@Description 查询所有资源列表
     *@Author: zhaols
     *@param pId    父资源id
     *@param resources 所有资源列表
     *@Return: List<ResponseBean>
     *@CreateTime: 2018-09-25  17:26
     */
    private List<ResponseBean> getResourcesSonTree(String pId,List<SysResources> resources,List<SysResources> userHavRes) {
        List<ResponseBean> resourceList = new ArrayList<>();
        for (SysResources s2 : resources) {
            if (pId.equals(s2.getParentCode())) {
                boolean checked = false;
                for (SysResources r: userHavRes) {
                    if(s2.getId().equals(r.getId())){
                        checked = true;
                        break;
                    }
                }
                resourceList.add(ResponseBean.getResponseBeanJson(s2.getDisplay(),false,getResourcesSonTree(s2.getId(),resources,userHavRes),false,checked,s2.getId()));
            }
        }
        return resourceList;
    }

    /**
     *@Description:  修改角色权限
     *@Author: zhaols
     *@param
     *@Return: java.lang.String
     *@CreateTime: 2018-09-30  14:01
     */
    public String saveAuth(){
        //取消所有旧权限
        try{
            sysResourcesService.updateAuth(roleId,selectBeforeRes,selectAfterRes);
            result = new Result(true,"权限赋予成功");

        }catch(Exception e ){
            e.printStackTrace();
            result = new Result(false,"操作失败，请联系管理员");
        }
        return RESULT;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<ResponseBean> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<ResponseBean> resourceList) {
        this.resourceList = resourceList;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getSelectBeforeRes() {
        return selectBeforeRes;
    }

    public void setSelectBeforeRes(String selectBeforeRes) {
        this.selectBeforeRes = selectBeforeRes;
    }

    public String getSelectAfterRes() {
        return selectAfterRes;
    }

    public void setSelectAfterRes(String selectAfterRes) {
        this.selectAfterRes = selectAfterRes;
    }
}

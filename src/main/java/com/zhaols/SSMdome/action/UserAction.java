package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.BasicClassDri.BasicAction;
import com.zhaols.SSMdome.entity.ActiveUser;
import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.service.IUserSysService;
import com.zhaols.SSMdome.utils.CommonUtils;
import com.zhaols.SSMdome.utils.Result;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAction extends BasicAction<SysUser> {
    @Autowired
    private IUserSysService userSysService;
    private ActiveUser activeUser;
    private List<SysUser> sysUserlist;
    //编辑类型
    private String type;
    //用户ID
    private String userId;

    /**
     * 首页展示用户信息
     * @return
     */
    public String getUser(){
        Subject subject = SecurityUtils.getSubject();
        activeUser = (ActiveUser) subject.getPrincipal();

        try{
            entity = userSysService.getUserById(activeUser.getUserid());
        }catch(Exception e){
        e.printStackTrace();
        }

        return "success";
    }

    /**
    *   功能描述: 获取user列表展示
    *
    *@Author: zhaols
    *@CreateTime: 2018-08-28  16:48
    */
    public String getUserList(){
        sysUserlist = userSysService.getUserList();
        return "userList";
    }
    
    
    /**
    *   功能描述: 跳转新增或编辑方法
    *
    *@Author: zhaols
    *@CreateTime: 2018-08-28  16:49
    */
    public String toAddOrEdit()  {
        type = getHttpServletRequest().getParameter("type");
        String id = getHttpServletRequest().getParameter("id");
        if(StringUtils.isEmpty(id)&& "add".equals(type)){
            entity = new SysUser();
            return "toAddOrEdit";
        }else {
            try{
                entity = userSysService.getUserById(id);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return "toAddOrEdit";
    }
    /**
    *@Description 保存和修改用户
    *@Author: zhaols
    *@params: []
    *@Return: java.lang.String
    *@CreateTime: 2018-09-18  15:26
    */
    public String saveAndUpdate(){
        if(StringUtils.isNotEmpty(entity.getuId())){
            //编辑
            try{
                userSysService.saveAndUpdate(entity);
                result = new Result(true,"编辑成功");
            }catch(Exception e ){
                e.printStackTrace();
                result = new Result(false,"编辑失败");
            }
        }else {
            //新增
            try{
                userSysService.saveAndUpdate(entity);
                result = new Result(true,"新增成功");
            }catch(Exception e ){
                result = new Result(false,"新增失败");
            }
        }
        return RESULT;
    }
    /**
    *   功能描述: 删除用户
    *
    *@Author: zhaols
    *@CreateTime: 2018-09-17  16:10
    */
    public String delete(){
        String id = getHttpServletRequest().getParameter("id");
        try{
            userSysService.deleteUser(id);
            result = new Result(true,"删除成功");
        }catch(Exception e ){
            e.printStackTrace();
            result = new Result(false,"删除失败");
        }
        return RESULT;
    }

    /**
    *@Description 跳转个人资料页面
    *@Author: zhaols
    *@params:
    *@Return: java.lang.String
    *@CreateTime: 2018-09-18  15:26
    */
    public String viewUserInfo(){
        String id = getHttpServletRequest().getParameter("id");
        if(StringUtils.isNotEmpty(id)){
        entity = userSysService.getUserById(id);
        }
        return "viewUserInfo";
    }
    /**
    *@Description 跳转修改用户密码页面
    *@Author: zhaols
    *@params: []
    *@Return: java.lang.String
    *@CreateTime: 2018-09-18  15:41
    */
    public String toChangePassword(){
        userId = getHttpServletRequest().getParameter("id");
        return "changePassword";
    }

    public String changePassword(){
        String oldPassword = getHttpServletRequest().getParameter("oldPassword");
        String nowPassword = getHttpServletRequest().getParameter("password");
        if(StringUtils.isNotEmpty(userId)){
            entity = userSysService.getUserById(userId);
            if(entity.getuPassword().equals(CommonUtils.MD5(oldPassword,entity.getRealSalt()))){
                entity.setuPassword(CommonUtils.MD5(nowPassword,entity.getRealSalt()));
            }else {
                result = new Result(false,"原密码输入有误，请重新输入");
                return RESULT;
            }
            try{
                userSysService.changePassword(entity,nowPassword);
                result = new Result(true,"密码修改成功,1秒后跳转登录页面");
            }catch (Exception e){
                e.printStackTrace();
                result = new Result(false,"密码修改失败");
            }
        }
        return RESULT;
    }
    /*===============================Getter/Setter======================*/
    public ActiveUser getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(ActiveUser activeUser) {
        this.activeUser = activeUser;
    }

    public List<SysUser> getSysUserlist() {
        return sysUserlist;
    }

    public void setSysUserlist(List<SysUser> sysUserlist) {
        this.sysUserlist = sysUserlist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

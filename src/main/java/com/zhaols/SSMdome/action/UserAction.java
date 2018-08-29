package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.entity.ActiveUser;
import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.service.IUserSysService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserAction {
    @Autowired
    private IUserSysService userSysService;

    private ActiveUser activeUser;

    private SysUser sysUser;

    private List<SysUser> sysUserlist;

    private String type;

    /**
     * 首页展示用户信息
     * @return
     */
    public String getUser(){
        Subject subject = SecurityUtils.getSubject();
        activeUser = (ActiveUser) subject.getPrincipal();

        try{
            sysUser = userSysService.getUserById(activeUser.getUserid());
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
        type = ServletActionContext.getRequest().getParameter("type");
        String id = ServletActionContext.getRequest().getParameter("id");
        if(StringUtils.isEmpty(id)&& "add".equals(type)){
            sysUser = new SysUser();
            return "toAddOrEdit";
        }else {
            try{
                sysUser = userSysService.getUserById(activeUser.getUserid());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return "toAddOrEdit";
    }
    public String saveAndUpdate(){
        return "";
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

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
}

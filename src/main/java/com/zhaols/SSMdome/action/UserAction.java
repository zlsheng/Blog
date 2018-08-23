package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.service.IUserSysService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAction {
    @Autowired
    private IUserSysService userSysService;

    private SysUser sysUser;
    public String getUser(){
        try{
            sysUser = userSysService.getUserById("1");
        }catch(Exception e){
        e.printStackTrace();
        }

        System.out.println(sysUser.getuLoginId());
        System.out.println(sysUser.getuEmail());
        System.out.println(sysUser.getuName());
        System.out.println(sysUser.getuNickname());
        System.out.println(sysUser.getuSex());
        return "success";
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }
}

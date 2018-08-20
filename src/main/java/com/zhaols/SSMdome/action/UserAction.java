package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.entity.UserSys;
import com.zhaols.SSMdome.service.IUserSysService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAction {
    @Autowired
    private IUserSysService userSysService;

    private UserSys userSys;
    public String getUser(){
        userSys = userSysService.getUserById("1");
        System.out.println(userSys.getuLoginId());
        System.out.println(userSys.getuEmail());
        System.out.println(userSys.getuName());
        System.out.println(userSys.getuNickname());
        System.out.println(userSys.getuSex());
        return "success";
    }

    public UserSys getUserSys() {
        return userSys;
    }

    public void setUserSys(UserSys userSys) {
        this.userSys = userSys;
    }
}

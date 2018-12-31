package com.zhaols.TargetManagementSystem.action;

import com.zhaols.SSMdome.BasicClassDri.BasicAction;
import com.zhaols.TargetManagementSystem.entity.TargetInfo;
import com.zhaols.TargetManagementSystem.service.ITargetInfoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-12-30 9:12
 */
public class TargetInfoAction extends BasicAction<TargetInfo, ITargetInfoService> {

    @Autowired
    private ITargetInfoService targetInfoService;

    @Override
    protected ITargetInfoService getEntityManager() {
        return targetInfoService;
    }

    @Override
    public String list() {
        System.out.println("dsadsadsacdsfsa ");
        super.list();
        System.out.println(entitys.size() + "      ----------");

        return SUCCESS;
    }
}

package com.zhaols.TargetManagementSystem.service.Impl;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.BasicClassDri.SuperService;
import com.zhaols.TargetManagementSystem.entity.TargetInfo;
import com.zhaols.TargetManagementSystem.mapper.TargetInfoMapper;
import com.zhaols.TargetManagementSystem.service.ITargetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-12-29 16:53
 */
@Service
public class TargetInfoService extends SuperService<TargetInfo> implements ITargetInfoService {

    @Autowired
    private TargetInfoMapper targetInfoMapper;

    @Override
    protected IEntityMapper<TargetInfo> getDao() {
        return targetInfoMapper;
    }
}

package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.BasicClassDri.SuperService;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.mapper.SysResourcesMapper;
import com.zhaols.SSMdome.service.ISysResourcesService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-25 16:49
 */
public class SysResourcesService extends SuperService<SysResources> implements ISysResourcesService {
    @Autowired
    private SysResourcesMapper resourcesMapper;

    @Override
    protected IEntityMapper<SysResources> getDao() {
        return resourcesMapper;
    }
}

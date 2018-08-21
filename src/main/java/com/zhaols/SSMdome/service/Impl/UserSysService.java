package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.entity.UserSys;
import com.zhaols.SSMdome.mapper.SysResourcesMapper;
import com.zhaols.SSMdome.mapper.UserSysMapper;
import com.zhaols.SSMdome.service.IUserSysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-20 14:16
 */
@Service
public class UserSysService implements IUserSysService {

    @Autowired
    private UserSysMapper userSysMapper;

    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    public UserSys getUserById(String id) throws Exception{
        return userSysMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserSys getUserByUloginid(String username) throws Exception {
        return  userSysMapper.getUserByUloginid(username);

    }

    @Override
    public List<SysResources> getSysResourcesByID(String userid) throws Exception{
        return sysResourcesMapper.getSysResourceListByUid(userid);
    }
}

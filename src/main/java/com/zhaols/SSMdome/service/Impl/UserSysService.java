package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.entity.SysRoleUserKey;
import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.mapper.SysResourcesMapper;
import com.zhaols.SSMdome.mapper.SysRoleUserMapper;
import com.zhaols.SSMdome.mapper.SysUserMapper;
import com.zhaols.SSMdome.service.IUserSysService;
import com.zhaols.SSMdome.utils.CommonUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-20 14:16
 */
@Service
public class UserSysService implements IUserSysService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysRoleUserMapper sysRoleUserMapper;

    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Override
    public SysUser getUserById(String id) throws Exception{
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysUser> getUserList() {
        return sysUserMapper.getAll();
    }

    @Override
    public void saveAndUpdate(SysUser entity) {
        if(StringUtils.isNotEmpty(entity.getuId())){
            //编辑
            entity.updateEntity();
            sysUserMapper.updateByPrimaryKeySelective(entity);
        }else {
            //新增
            entity.setuId(CommonUtils.getUUID());
            entity.setuSalt(entity.getuId());
            entity.createEntity();
            entity.setuPassword(CommonUtils.MD5(entity.getuPassword(),entity.getuSalt()));
            sysUserMapper.insertSelective(entity);
            //新增用户默认赋予 普通用户 的角色
            SysRoleUserKey sysRoleUserKey = new SysRoleUserKey();
            sysRoleUserKey.setUserId(entity.getuId());
            sysRoleUserKey.setRoleId("PTYH");
            sysRoleUserMapper.insert(sysRoleUserKey);
        }

    }

    @Override
    public void deleteUser(String id) {
        sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void amendLoginInfo(String username,String loginIp, Date loginTime) {
        Map map = new HashMap();
        map.put("loginIp",loginIp);
        map.put("loginTime",loginTime);
        map.put("username",username);
        sysUserMapper.amendLoginInfo(map);
    }
}

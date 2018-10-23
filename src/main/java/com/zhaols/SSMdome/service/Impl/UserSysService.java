package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.BasicClassDri.SuperService;
import com.zhaols.SSMdome.MyExcption.ManagerException;
import com.zhaols.SSMdome.entity.SysRole;
import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.mapper.SysResourcesMapper;
import com.zhaols.SSMdome.mapper.SysRoleMapper;
import com.zhaols.SSMdome.mapper.SysRoleUserMapper;
import com.zhaols.SSMdome.mapper.SysUserMapper;
import com.zhaols.SSMdome.service.IUserSysService;
import com.zhaols.SSMdome.utils.CommonUtils;
import org.apache.commons.lang3.StringUtils;
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
public class UserSysService extends SuperService<SysUser> implements IUserSysService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysRoleUserMapper sysRoleUserMapper;


    @Override
    public SysUser getUserById(String id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysUser> getUserList()  {
        return sysUserMapper.getAll();
    }

    @Override
    public void saveAndUpdate(SysUser entity)  {
        if(StringUtils.isNotEmpty(entity.getuId())){
            //编辑
            entity.updateEntity();
            sysUserMapper.updateByPrimaryKeySelective(entity);
        }else {
            //新增
            entity.setuId(CommonUtils.getUUID());
            entity.setuHeadportrait("defalut.jpg");
            entity.createEntity();
            entity.setBase64Password(CommonUtils.encodeData(entity.getuPassword()));
            entity.setuPassword(CommonUtils.MD5(entity.getuPassword(),entity.getRealSalt()));
            sysUserMapper.insertSelective(entity);
            //新增用户默认赋予 普通用户 的角色
            updateRole(entity.getuId(),"PTYH");
        }

    }

    @Override
    public void deleteUser(String id)  {
        sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void amendLoginInfo(String username,String loginIp, Date loginTime)  {
        Map map = new HashMap();
        map.put("loginIp",loginIp);
        map.put("loginTime",loginTime);
        map.put("username",username);
        sysUserMapper.amendLoginInfo(map);
    }

    @Override
    public void registration(SysUser entity) throws ManagerException {
        entity.setuId(CommonUtils.getUUID());
        entity.setuHeadportrait("defalut.jpg");
        entity.setBase64Password(CommonUtils.encodeData(entity.getuPassword()));
        entity.setuPassword(CommonUtils.MD5(entity.getuPassword(),entity.getRealSalt()));
        entity.setuRegistertime(new Date());
        try{
            sysUserMapper.insertSelective(entity);
        }catch (Exception e){
            e.printStackTrace();
            throw new ManagerException("100200",new String[]{"用户注册失败"});
        }
        updateRole(entity.getuId(),"PTYH");
    }

    /**
    *   功能描述:  为用户赋予角色
    *
    *@Author: zhaols
    *@param:  用户id 角色id
    *@Return: null
    *@CreateTime: 2018-09-13  14:20
    */
    public void updateRole(String u_id,String r_id) {
        Map<String,String> map = new HashMap<>();
        map.put("userId",u_id);
        map.put("roleId",r_id);
        sysRoleUserMapper.insert(map);
    }

    @Override
    public void changePassword(SysUser entity, String nowPassword) {
        entity.setuPassword(CommonUtils.MD5(nowPassword,entity.getRealSalt()));
        sysUserMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    protected IEntityMapper<SysUser> getDao() {
        return sysUserMapper;
    }

    @Override
    public void updateUserRole(String u_id, String r_id) {
        Map<String,String> map = new HashMap<>();
        map.put("userId",u_id);
        map.put("roleId",r_id);
        sysRoleUserMapper.insert(map);
    }

}

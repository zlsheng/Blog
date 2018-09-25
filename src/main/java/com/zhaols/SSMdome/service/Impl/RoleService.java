package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.BasicClassDri.SuperService;
import com.zhaols.SSMdome.entity.SysRole;
import com.zhaols.SSMdome.mapper.SysRoleMapper;
import com.zhaols.SSMdome.service.IRoleService;
import com.zhaols.SSMdome.utils.CommonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-20 16:18
 */
@Service
public class RoleService extends SuperService<SysRole> implements IRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    protected IEntityMapper<SysRole> getDao() {
        return sysRoleMapper;
    }

    @Override
    public List<SysRole> getAll() {
        Map<String,String> map = new HashMap();
        return sysRoleMapper.getAll(map);
    }

    @Override
    public List<SysRole> queryRole() {
        Map<String,String> map = new HashMap();
        map.put("status","11");
        return sysRoleMapper.getAll(map);
    }

    @Override
    public List<SysRole> getRoleByUid(String u_id) {
        return sysRoleMapper.getRoleByUid(u_id);
    }

    @Override
    public SysRole queryRoleByCode(String code) {
        return sysRoleMapper.queryRoleByCode(code);
    }

    @Override
    public void saveAndUpdate(SysRole entity) {
        if(StringUtils.isNotEmpty(entity.getId())){
            //编辑
            entity.updateEntity();
            sysRoleMapper.updateByPrimaryKeySelective(entity);
        }else{
            entity.setId(CommonUtils.getUUID());
            entity.createEntity();
            entity.setStatus("11");
            sysRoleMapper.insertSelective(entity);
        }
    }

    @Override
    public void deleteRole(String id) {
        sysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateRoleEnable(String id, String isEnable) {
        Map<String,String> map = new HashMap<>();
        map.put("id",id);
        map.put("isEnable",isEnable);
        sysRoleMapper.updateRoleEnable(map);
    }
}

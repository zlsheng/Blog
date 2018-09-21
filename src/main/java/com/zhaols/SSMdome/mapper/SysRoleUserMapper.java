package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.entity.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SysRoleUserMapper {

    void insert(Map<String, String> map);

}
package com.zhaols.SSMdome.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface SysRoleUserMapper {

    void insert(Map<String, String> map);
}
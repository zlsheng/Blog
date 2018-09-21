package com.zhaols.SSMdome.service;

import com.zhaols.SSMdome.BasicClassDri.ISuperService;
import com.zhaols.SSMdome.entity.SysRole;

import java.util.List;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-20 16:18
 */
public interface IRoleService extends ISuperService<SysRole> {

    List<SysRole> queryRole(String status);

}

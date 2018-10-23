package com.zhaols.SSMdome.BasicClassDri;

import com.zhaols.SSMdome.entity.SysUser;

import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-27 15:46
 */
public interface ISuperService<T extends Entity> {
    List<T> getAll();
    T  get(String id);
    public Page pagedQuery(ModelSetup modelSetup, int pageNo, int pageSize);
}

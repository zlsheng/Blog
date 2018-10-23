package com.zhaols.SSMdome.BasicClassDri;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-21 10:23
 */
@Repository
public interface IEntityMapper<T extends Entity> {
    List<T> getAll();
    T get(String id);
}

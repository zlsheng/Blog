package com.zhaols.SSMdome.BasicClassDri;

import java.io.Serializable;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-30 15:50
 */
@SuppressWarnings("serial")
public abstract class Entity<T> implements Serializable {
    /**
     * 统一的ID声明
     *
     */
    private T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}

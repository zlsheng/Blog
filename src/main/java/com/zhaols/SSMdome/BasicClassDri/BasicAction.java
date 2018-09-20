package com.zhaols.SSMdome.BasicClassDri;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.zhaols.SSMdome.utils.GenericsUtils;
import com.zhaols.SSMdome.utils.ResponseBean;
import com.zhaols.SSMdome.utils.Result;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-30 15:05
 */
public class BasicAction<T extends Entity> extends ActionSupport implements Preparable, ModelDriven {
    public static final String RESULT="result";
    public static final String RESPONSEBEAN="responseBean";
    public static final String SUCCESS="success";

    /**
     * 业务对象
     */
    protected T entity;



    protected Class<T> entityClass; // Action所管理的Entity类型.

    protected Class idClass; // Action所管理的Entity的主键类型.

    protected String idName; // Action所管理的Entity的主键名.

    protected int start = 1;
    protected int limit;
    protected long totalCount;

    public Result result;

    public ResponseBean responseBean;

    protected List entitys = new ArrayList();
    @Override
    public Object getModel() {
        return entity;
    }

    @Override
    public void prepare() throws Exception {
        entityClass = GenericsUtils.getSuperClassGenricType(getClass());
        /*try {
            idName = getEntityManager().getIdName(entityClass);
            idClass = BeanUtils.getPropertyType(entityClass, idName);
        } catch (Exception e) {
            ReflectionUtils.handleReflectionException(e);
        }*/
        entity = entityClass.newInstance();
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public Class getIdClass() {
        return idClass;
    }

    public void setIdClass(Class idClass) {
        this.idClass = idClass;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    @JSON(serialize = true)
    public List<T> getEntitys() {
        return entitys;
    }

    public void setEntitys(List<T> entitys) {
        this.entitys = entitys;
    }
    public HttpServletRequest getHttpServletRequest(){
        return ServletActionContext.getRequest();
    }
    public ServletContext getServletContext(){
        return ServletActionContext.getServletContext();
    }
}

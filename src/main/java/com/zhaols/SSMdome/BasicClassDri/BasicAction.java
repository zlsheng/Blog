package com.zhaols.SSMdome.BasicClassDri;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.zhaols.SSMdome.utils.GenericsUtils;
import com.zhaols.SSMdome.utils.ResponseBean;
import com.zhaols.SSMdome.utils.Result;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.json.annotations.JSON;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-30 15:05
 */
abstract public class BasicAction<T extends Entity,M extends ISuperService> extends ActionSupport implements Preparable, ModelDriven {
    public static final String RESULT="result";
    public static final String RESPONSEBEAN="responseBean";
    public static final String SUCCESS="success";
    private ActionContext context; // struts的ActionContext

    /**
     * 获得EntityManager类进行CRUD操作,可以在子类重载.
     */
    @JSON(serialize = false)
    protected abstract M getEntityManager();
    /**
     * 业务对象
     */
    protected T entity;



    protected Class<T> entityClass; // Action所管理的Entity类型.

    protected Class idClass; // Action所管理的Entity的主键类型.

    protected String idName; // Action所管理的Entity的主键名.

    private ModelSetup filter;

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


    /**
     * 默认首页，列表页面
     *
     * @return
     */
    @Override
    public String execute() {
        return list();
    }

    public String list() {
        HttpParameters params = getActionContext().getParameters();
        for (Map.Entry entry : params.entrySet()) {
            if (entry.getValue() instanceof String[]) {
                String[] vals = (String[]) entry.getValue();
                entry.setValue(new String[]{vals[0].toString().trim()});
            }
        }
        filter = setupModel();
        doPageEntity(filter);
        return SUCCESS;
    }

    protected ModelSetup setupModel() {
        MyBatisModelSetup model = (MyBatisModelSetup) getModelSetupFromRequest(ORMType.MYBATIS);
        String path = getMapperPath(entity);
        model.setCountName(path + ".mapper." + entityClass.getSimpleName() + "Mapper.count");
        model.setSqlName(path + ".mapper." + entityClass.getSimpleName() + "Mapper.select");
        return model;

    }
    protected String getMapperPath(Entity entity){
        String path = "";
        path = entity.getClass().getPackage().getName();
        path = path.substring(0,path.lastIndexOf("."));
        return path;
    }
    protected void doPageEntity(ModelSetup modelSetup) {
        if (limit == 0){
            limit = Page.DEFAULT_PAGE_SIZE;
        }
        if (start < 1){
            start = 1;
        }
        //int pageNo=start/limit+1;
        Page page = getEntityManager().pagedQuery(modelSetup, start, limit);
        this.setEntitys(page.getResult());
        this.setTotalCount(page.getTotalCount());
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




    /**
     * 获得ActionContext
     * @return ActionContext
     *
     */
    public ActionContext getActionContext() {
        return context == null ? context = ActionContext.getContext() : context;
    }

    public ModelSetup getModelSetupFromRequest(ORMType orm) {
        final HttpParameters params=getActionContext().getParameters();
        Map<String,Object> parameters=new HashMap<String,Object>();
        Set<String> keys = params.keySet();
        for(String key:keys){
            String value = params.get(key).getValue();
            if(value!=null && !("".equals(value))){
                parameters.put(key,value);
            }
        }
        ModelSetup model;
        switch (orm) {
            case IBATIS:
                model=new MyBatisModelSetup();
                break;
            case MYBATIS:
                model=new MyBatisModelSetup();
                break;
            default:
                model=new MyBatisModelSetup();
        }
        model.setup(parameters);
        return model;
    }
}

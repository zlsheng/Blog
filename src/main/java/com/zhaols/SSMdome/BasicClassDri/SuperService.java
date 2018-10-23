package com.zhaols.SSMdome.BasicClassDri;

import com.zhaols.SSMdome.utils.GenericsUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-21 10:20
 */
abstract public class SuperService<T extends Entity> implements ISuperService<T> {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public Class<T> getEntityClass() {
        if (entityClass == null)
            entityClass = (Class<T>) GenericsUtils.getSuperClassGenricType(getClass());
        return entityClass;
    }

    protected Class<T> entityClass;

    protected String getEntityName() {
        return getEntityClass().getSimpleName();
    }

    abstract protected IEntityMapper<T> getDao();


    @Override
    public List<T> getAll() {
        return getDao().getAll();
    }

    @Override
    public T get(String id) {
        return getDao().get(id);
    }

    @Override
    public Page pagedQuery(ModelSetup modelSetup, int pageNo, int pageSize) {
        MyBatisModelSetup model = (MyBatisModelSetup) modelSetup;
        String countSqlName = model.getCountName();
        Assert.hasText(countSqlName, "count sql name not null");
        String sqlName = model.getSqlName();
        Assert.hasText(sqlName, "sql name not null");
        return queryPage(countSqlName, sqlName, ((MyBatisModelSetup) modelSetup).getParameters(), pageNo, pageSize);
    }

    private Page queryPage(String count, String statement, Object parameter,
                           int pageNo, int pageSize) {
        SqlSession session = sqlSessionFactory.openSession();
        Assert.isTrue(pageNo >= 1, "pageNo should start from 1");
        if (pageNo < 1){
            pageNo = 1;
        }
        // 计算总数
        try{
             Integer totalCount = session.selectOne(count,parameter) ;

             // 如果没有数据则返回Empty Page
             Assert.notNull(totalCount, "totalCount Error");

             if (totalCount == null || totalCount.intValue() == 0) {
                 return new Page();
             }
             List list = new ArrayList();
             int totalPageCount = 0;
             int startIndex = 0;

             // 如果pageSize小于等于0,pageSize=Page.DEFAULT_PAGE_SIZE
             if (pageSize <= 0){
                 pageSize = Page.DEFAULT_PAGE_SIZE;
             }
             // 计算页数
             totalPageCount = (totalCount / pageSize);
             totalPageCount += (((totalCount % pageSize) > 0) ? 1 : 0);

             // 计算skip数量
             if (totalPageCount > pageNo) {
                 startIndex = (pageNo - 1) * pageSize;
             } else {
                 startIndex = (totalPageCount - 1) * pageSize;
             }
             list = session.selectList(statement,parameter,new RowBounds(startIndex,pageSize));

             return new Page(startIndex, totalCount, pageSize, list);
        }catch (SqlSessionException e){
            e.printStackTrace();
            return new Page();
        }finally {
            session.close();
        }
    }
}

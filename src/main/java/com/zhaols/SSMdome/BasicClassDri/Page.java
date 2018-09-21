package com.zhaols.SSMdome.BasicClassDri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-21 11:07
 */
public class Page implements Serializable {
    /**
     * 持久化.
     */
    private static final long serialVersionUID = -1L;

    /**
     * 默认分页数.
     */
    public static final int DEFAULT_PAGE_SIZE = 20;

    /**
     * 每页的记录数.
     */
    private int pageSize = DEFAULT_PAGE_SIZE;

    /**
     * 当前页第一条数据在List中的位置,从0开始.
     */
    private int start;

    /**
     * 当前页中存放的记录,类型一般为List.
     */
    @SuppressWarnings("unchecked")
    private List data;

    /**
     * 总记录数.
     */
    private long totalCount;

    /**
     * 构造方法，只构造空页.
     */
    public Page() {
        this(0, 0, DEFAULT_PAGE_SIZE, new ArrayList<Object>());
    }

    /**
     * 默认构造方法.
     *
     * @param startIn     本页数据在数据库中的起始位置
     * @param totalSizeIn 数据库中总记录条数
     * @param pageSizeIn  本页容量
     * @param dataIn      本页包含的数据
     */
    @SuppressWarnings("unchecked")
    public Page(int startIn, long totalSizeIn, int pageSizeIn,
                List dataIn) {
        pageSize = pageSizeIn;
        start = startIn;
        totalCount = totalSizeIn;
        data = dataIn;
    }

    /**
     * @return long 总记录数.
     */
    public long getTotalCount() {
        return totalCount;
    }

    /**
     * @return long 总页数.
     */
    public long getTotalPageCount() {
        if ((totalCount % pageSize) == 0) {
            return totalCount / pageSize;
        } else {
            return (totalCount / pageSize) + 1;
        }
    }

    /**
     * @return int 每页记录数.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @return Object 本页包含的数据.
     */
    public List getResult() {
        return data;
    }

    /**
     * @return long 当前页码，从1开始.
     */
    public long getCurrentPageNo() {
        return (start / pageSize) + 1;
    }

    /**
     * @return boolean 是否有下一页
     */
    public boolean hasNextPage() {
        return this.getCurrentPageNo() < this.getTotalPageCount();
    }

    /**
     * @return boolean 是否有上一页
     */
    public boolean hasPreviousPage() {
        return this.getCurrentPageNo() > 1;
    }

    /**
     * 获取任一页第一条数据在数据集的位置，每页条数使用默认值.
     *
     * @see #getStartOfPage(int,int)
     * @param pageNo 页码
     * @return int 第一条记录的位置
     */
    protected static int getStartOfPage(int pageNo) {
        return getStartOfPage(pageNo, DEFAULT_PAGE_SIZE);
    }

    /**
     * 获取任一页第一条数据在数据集的位置.
     *
     * @param pageNo   从1开始的页号
     * @param pageSize 每页记录条数
     * @return 该页第一条数据
     */
    public static int getStartOfPage(int pageNo, int pageSize) {
        return (pageNo - 1) * pageSize;
    }
}

package com.zhaols.SSMdome.BasicClassDri;
import com.zhaols.SSMdome.entity.ActiveUser;
import org.apache.shiro.SecurityUtils;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-30 15:28
 */
@SuppressWarnings("serial")
public class BasicEntity<T> extends Entity<T> implements Serializable  {
    private static final long serialVersionUID = 1L;

    /** 更新人name */
    private String  updatorName;

    /** 更新人ID */
    private String  updator;

    /** 更新时间 */
    private Date updateTime;

    /** 创建人ID */
    private String  creator;

    /** 创建人name */
    private String  creatorName;

    /** 创建时间 */
    private Date  createTime;


    public void updateEntity(){
        ActiveUser subject = (ActiveUser)SecurityUtils.getSubject().getPrincipal();
        if (null != subject) {
            this.setUpdator(subject.getUserid().toString());
            this.setUpdatorName(subject.getUsername());
        }
        this.setUpdateTime(new Date());
    }

    public void createEntity() {
        ActiveUser subject = (ActiveUser)SecurityUtils.getSubject().getPrincipal();
        if (null != subject) {
            this.setCreator(subject.getUserid().toString());
            this.setCreatorName(subject.getUsername());
        }
        this.setCreateTime(new Date());
        this.updateEntity();
    }

    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

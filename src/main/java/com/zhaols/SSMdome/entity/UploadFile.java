package com.zhaols.SSMdome.entity;

import com.zhaols.SSMdome.BasicClassDri.BasicEntity;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-09-14 16:00
 */
public class UploadFile extends BasicEntity<String> {
    private String oldFileName;

    public String getOldFileName() {
        return oldFileName;
    }

    public void setOldFileName(String oldFileName) {
        this.oldFileName = oldFileName;
    }
}

package com.zhaols.SSMdome.BasicClassDri;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-21 10:49
 */
public class MyBatisModelSetup implements ModelSetup {

    private String sqlName;//namedquery name  by query

    private String countName;// namedquery name by count
    private Map<String,Object> parameters=new HashMap<String,Object>();

    public void addParameter(String namedParameter,Object value){
        this.parameters.put(namedParameter,value);
    }

    public Map getParameters(){
        return this.parameters;
    }
    @Override
    public void setup(Map<String,Object> params){
        Set<String> keys = params.keySet();
        for (String key : keys) {
            Object value = params.get(key);
            if (value!=null)
                parameters.put(key,value);


        }

    }

    public String getSqlName() {
        return sqlName;
    }

    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }


    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

}

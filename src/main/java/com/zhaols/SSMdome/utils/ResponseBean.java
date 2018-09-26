package com.zhaols.SSMdome.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zlsheng
 * @Description: TODO: 添加功能描述
 * @date 2018-07-06 15:45
 */
public class ResponseBean extends HashMap<String, Object> {

    /**
     *@Description 用户返回固定格式json数据
     * 格式 {
     *      label: 节点名称
     *      spread: 是否展开子项
     *      children: {
     *             label: 节点名称
     *             spread: 是否展开子项
     *             children: {
     *                 ....
     *             }子元素数组
     *             disabled: 是否禁用
     *             checked: 是否选中
     *      }子元素数组
     *      disabled: 是否禁用
     *      checked: 是否选中
     * }
     *@Author: zhaols
     *@param label 节点名称
     *@param spread 是否展开子项
     *@param children 子元素数组
     *@param disabled 是否禁用
     *@param checked 是否选中
     *@Return: com.zhaols.SSMdome.utils.ResponseBean
     *@CreateTime: 2018-09-25  16:43
     */
    public static ResponseBean getResponseBeanJson(String label,boolean  spread, List<ResponseBean> children,boolean disabled,boolean checked,Object data) {
        ResponseBean responseBean = new ResponseBean();
        responseBean.put("label",label);
        responseBean.put("spread",spread);
        responseBean.put("children",children);
        responseBean.put("disabled",disabled);
        responseBean.put("checked",checked);
        responseBean.put("data",data);
        return responseBean;
    }
   /* private String label;
    private boolean spread;
    private List<ResponseBean> children;
    private boolean disabled;
    private boolean checked;
    private Object data;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isSpread() {
        return spread;
    }

    public void setSpread(boolean spread) {
        this.spread = spread;
    }

    public List<ResponseBean> getChildren() {
        return children;
    }

    public void setChildren(List<ResponseBean> children) {
        this.children = children;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }*/

    /**
     * 格式 {
     *      label: 节点名称
     *      spread: 是否展开子项
     *      children: {
     *             label: 节点名称
     *             spread: 是否展开子项
     *             children: {
     *                 ....
     *             }子元素数组
     *             disabled: 是否禁用
     *             checked: 是否选中
     *      }子元素数组
     *      disabled: 是否禁用
     *      checked: 是否选中
     *      data: 数据
     * }
     *@CreateTime: 2018-09-25  16:43

    public ResponseBean(String label, boolean spread, List<ResponseBean> children, boolean disabled, boolean checked, Object data) {
        this.label = label;
        this.spread = spread;
        this.children = children;
        this.disabled = disabled;
        this.checked = checked;
        this.data = data;
    }*/
}

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
    public static ResponseBean getResponseBeanJson(String label,boolean  spread, ResponseBean children,boolean disabled,boolean checked) {
        ResponseBean responseBean = new ResponseBean();
        responseBean.put("label",label);
        responseBean.put("spread",spread);
        responseBean.put("children",children);
        responseBean.put("disabled",disabled);
        responseBean.put("checked",checked);
        return responseBean;
    }

    /**
    *   功能描述: 用于返回固定格式json数据
    *
     * 格式 ： {code:
     *          msg:
     *          data:
     *          }
    *@Author: zlsheng
    *@param:
    *@Return:
    *@CreateTime: 2018-07-06  16:21
    */
    public static ResponseBean getResponseBeanJson(Integer code,String msg, List<?> list) {
        ResponseBean responseBean = new ResponseBean();

        return responseBean;
    }
    /**
     *   功能描述: 用于返回固定格式json数据
     *
     * 格式 ： {code:
     *          msg:
     *          data:
     *          }
     *@Author: zlsheng
     *@param:
     *@Return:
     *@CreateTime: 2018-07-06  16:21
     */
    public static ResponseBean getResponseBeanJson(Integer code,String msg, Map<String,String> map) {
        ResponseBean responseBean = new ResponseBean();
        responseBean.put("code", code);
        responseBean.put("msg", msg);
        responseBean.put("data",map);
        return responseBean;
    }
    /**
     *   功能描述: 用于返回固定格式json数据
     *
     * 用于表格分页
     * 格式 ： {code:
     *          msg:
     *          data:
     *          count:
     *          }
     *@Author: zlsheng
     *@param:
     *@Return:
     *@CreateTime: 2018-07-06  16:21
     */
    public static ResponseBean getResponseBeanJson(Integer code,String msg, List<?> list,Integer count) {
        ResponseBean responseBean = new ResponseBean();
        responseBean.put("code", code);
        responseBean.put("msg", msg);
        responseBean.put("data",list);
        responseBean.put("count",count);
        return responseBean;
    }
}

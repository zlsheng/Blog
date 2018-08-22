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
        responseBean.put("code", code);
        responseBean.put("msg", msg);
        responseBean.put("data",list);
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

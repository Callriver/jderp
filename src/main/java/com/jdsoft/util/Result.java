package com.jdsoft.util;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.jdsoft.exception.enums.ErrorEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回类
 */

public class Result  {
    /**
     * Constructs an empty <tt>HashMap</tt> with the default initial capacity
     * (16) and the default load factor (0.75).
     */
    private static JSONObject json;

    /**
     * 成功
     * @return
     */
    public static String ok(){
        //为true的话默认排序
        json=new JSONObject(true);
        json.put("status","200");
        json.put("msg","success");
        json.put("data",null);
        return json.toJSONString();
    }

    /**
     * 带数据成功
     * @param obj
     * @return
     */
    public static String ok(Object obj){
        //为true的话默认排序
        json=new JSONObject(true);
        json.put("status","200");
        json.put("msg","success");
        json.put("data",obj);
        return json.toJSONString();
    }

    /**
     * 失败
     * @param msg
     * @return
     */
    public static String fail(String msg){
        //为true的话默认排序
        json=new JSONObject(true);
        json.put("status","500");
        json.put("msg",msg);
        json.put("data",null);
        return json.toJSONString();
    }

    /**
     * 带数据失败
     * @param msg
     * @param obj
     * @return
     */
    public static String fail(String msg,Object obj){
        //为true的话默认排序
        json=new JSONObject(true);
        json.put("status","500");
        json.put("msg",msg);
        json.put("data",obj);
        return json.toJSONString();
    }
}

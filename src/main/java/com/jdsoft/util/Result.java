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

public class Result<T>  {
    /**
     * Constructs an empty <tt>HashMap</tt> with the default initial capacity
     * (16) and the default load factor (0.75).
     */
    private int code;
    private String msg;
    private T data;


    public Result(){

    }

    public Result(int code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Result(int code, String msg) {
        this(code, msg, null);
    }

    /*成功无返回值*/
    public static Result success(String message) {
        return new Result(200, message);
    }

    /*成功带返回值*/
    public static <T> Result<T> success(String message, T data) {
        return new Result(200, message, data);
    }

    /*失败无返回值*/
    public static Result fail(int code, String msg) {
        return new Result(code, msg);
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String message) {
        this.msg = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

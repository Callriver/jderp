package com.jdsoft.exception.enums;

public enum ErrorEnum {
    QUERY(-1,"查询失败"),
    UPDATE(-2,"修改失败"),
    DELETE(-3,"删除失败"),
    ADD(-4,"添加失败"),
    LOGIN(-5,"登录失败"),
    ARGUMENT(-6,"缺少参数"),
    PRIVILEGE(-7,"权限不够"),
    UPLOAD(-8,"上传失败");


    private int code;
    private String msg;
    ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

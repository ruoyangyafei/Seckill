package com.cz.seckill.seckill.commons;

/**
 * Created by changyaqian on 2018/4/15.
 */
public enum ResponseCode {

    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEAGL_ARGUMENT(2,"ILLEAGL_ARGUMENT");

    private  final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code=code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}

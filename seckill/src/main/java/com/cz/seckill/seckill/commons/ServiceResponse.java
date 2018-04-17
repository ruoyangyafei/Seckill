package com.cz.seckill.seckill.commons;

import java.io.Serializable;

/**
 * Created by changyaqian on 2018/4/15.
 */
public class ServiceResponse<T> implements Serializable {
    private  int status;
    private String msg;
    private T data;

    private ServiceResponse(int status) {
        this.status = status;
    }

    private ServiceResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    private ServiceResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private ServiceResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public boolean isSuccess(){
        return this.status==ResponseCode.SUCCESS.getCode();
    }

    public  int getStatus(){
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public static <T> ServiceResponse<T> createBySuccess(){
        return  null;
    }
}

package com.cz.seckill.seckill.commons;


import java.util.HashMap;

public class JsonGeneralResponse<E> {


    /**
     * 消息说明ID，为了支持国际化
     */
    private String msg = "";

    /**

     *数据
     */
    private E data;
    /**消息体*/
    private String error_message = "";

    public JsonGeneralResponse() {
    }
    public JsonGeneralResponse(String error_message) {
        this.error_message = error_message;
    }
    public JsonGeneralResponse(String msg, int code) {
        this.msg = msg;
    }

    public JsonGeneralResponse(String msg, int code, E e){
        this.msg = msg;
        this.data = e;
    }

    public Object getData() {
        return data==null?new HashMap():data;
        //return data;
    }

    public void setData(E data) {
        this.data = data;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void setError_message(String error_message) {
        this.error_message = error_message;
    }
    @Override
    public String toString() {
        return "JsonGeneralResponse [msg=" + msg
                + "]";
    }


}

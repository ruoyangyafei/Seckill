package com.cz.seckill.seckill.web.controller;

import com.cz.seckill.seckill.util.JsonGeneralResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/**
 * 封装公用返回
 *Created by changyaqian on 2017/12/14.
 */
public class BaseController {
    /**
     * 日志对象.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 成功-无返回结果
     *
     * @return
     * @author
     */
    protected ResponseEntity success() {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 成功-有返回状态
     *
     * @return
     * @author
     */
    protected ResponseEntity success(String msg) {
        JsonGeneralResponse response = new JsonGeneralResponse();
        response.setMsg(msg);
        return new ResponseEntity(response,HttpStatus.OK);
    }

    /**
     * 成功-有返回结果
     *
     * @param content
     * @return
     * @author
     */
    protected ResponseEntity success(Object content) {
        JsonGeneralResponse response = new JsonGeneralResponse("成功",1,content);
        return new ResponseEntity(response,HttpStatus.OK);
    }

    /**
     * 成功-有返回状态，结果
     *
     * @param content
     * @return
     * @author
     */
    protected ResponseEntity success(String msg,Object content) {
        JsonGeneralResponse response = new JsonGeneralResponse(msg,0,content);
        return new ResponseEntity(response,HttpStatus.OK);
    }


    /**
     * 失败  返回原因和状态
     * @param message
     * @return
     */
    protected ResponseEntity error(String message) {
        JsonGeneralResponse response = new JsonGeneralResponse();
        response.setMsg(message);
        return new ResponseEntity(response,  HttpStatus.BAD_REQUEST);
    }
}

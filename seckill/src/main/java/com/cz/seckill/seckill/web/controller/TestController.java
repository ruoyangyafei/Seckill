package com.cz.seckill.seckill.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
/**
 * Created by changyaqian on 2017/12/14.
 */
@RestController
public class TestController extends BaseController{
    @GetMapping("/v1/seckill/test")
    public ResponseEntity test(){
        return success("Hello World!");
    }
}

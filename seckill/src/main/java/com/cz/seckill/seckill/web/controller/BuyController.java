package com.cz.seckill.seckill.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyController extends BaseController {
    @Autowired
    TaskExecutor executor;
    public void test(){
        executor.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
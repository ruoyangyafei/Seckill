package com.cz.seckill.seckill.web.domain;

import org.springframework.http.HttpRequest;

/**
 * 封装订单信息领域对象
 * Created by changyaqian on 2017/12/19.
 */
public class BidInfo {
    BidInfo(HttpRequest request){

    }
    //订单uuid
    private String orderUuid;
}
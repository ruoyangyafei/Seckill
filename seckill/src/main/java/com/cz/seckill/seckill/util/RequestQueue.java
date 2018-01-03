package com.cz.seckill.seckill.util;

import org.springframework.http.HttpRequest;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by changyaqian on 2018/1/3.
 */
public class RequestQueue {
    public static ConcurrentLinkedQueue<HttpRequest> queue = new ConcurrentLinkedQueue<HttpRequest>();
}

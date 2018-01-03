package com.cz.seckill.seckill.web.domain;
/**
 * 封装请求领域对象
 * Created by changyaqian on 2017/12/19.
 */
public class BuyRequest {
    //商品uuid
    private String goodUuid;
    //用户uuid
    private String userUuid;
    //订单uuid
    private String orderUuid;
    //订单信息
    private BidInfo bidInfo;
    //0：未处理；1：正常；2：异常
    private int responseStatus;

    public String getGoodUuid() {
        return goodUuid;
    }

    public void setGoodUuid(String goodUuid) {
        this.goodUuid = goodUuid;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid;
    }

    public BidInfo getBidInfo() {
        return bidInfo;
    }

    public void setBidInfo(BidInfo bidInfo) {
        this.bidInfo = bidInfo;
    }

    public int getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }
}
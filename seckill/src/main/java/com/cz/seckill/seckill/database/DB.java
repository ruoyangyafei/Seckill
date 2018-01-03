package com.cz.seckill.seckill.database;

import com.cz.seckill.seckill.web.domain.BidInfo;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by changyaqian on 2018/1/3.
 */
public class DB {
    public static int count=10;
    public static ArrayBlockingQueue<BidInfo> bids = new ArrayBlockingQueue<BidInfo>(count);
    public static boolean checkReminds(){
        return true;
    }
    //单线程操作
    public static void bid(){
        BidInfo info = bids.poll();
        while (count-->0){
            // insert into table Bids values(item_id, user_id, bid_date, other)

            // select count(id) from Bids where item_id = ?

            // 如果数据库商品数量大约总数，则标志秒杀已完成，设置标志位reminds = false.
            info = bids.poll();
        }
    }
}

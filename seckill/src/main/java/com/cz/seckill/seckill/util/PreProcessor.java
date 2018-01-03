package com.cz.seckill.seckill.util;

import com.cz.seckill.seckill.database.RPC;
import org.springframework.http.HttpRequest;

/**
 * 预处理阶段，把不必要的请求直接驳回，必要的请求添加到队列中进入下一阶段
 * Created by changyaqian on 2018/1/3.
 */
public class PreProcessor {
    //商品是否还有剩余
    private static boolean reminds = true;
    private static  void forbidden(){
        //do something
    }
    public static boolean checkReminds(){
        if (reminds){
            //远程监测是否还有剩余，该RPC接口应由数据库服务器提供，不必完全严格检查
            if (!RPC.checkReminds()){
                reminds=false;
            }
        }
        return reminds;
    }

    public static void preProcess(HttpRequest request){
        if (checkReminds()){
            //一个并发的队列
            RequestQueue.queue.add(request);
        }else {
            //如果已经没有商品了，则直接驳回请求即可
            forbidden();
        }
    }
}

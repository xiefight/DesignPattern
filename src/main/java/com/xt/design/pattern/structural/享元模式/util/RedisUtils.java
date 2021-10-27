package com.xt.design.pattern.structural.享元模式.util;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: Redis工具类，处理库存
 * @Author: xietao
 * @Date: 2021-10-26 13:50
 **/
public class RedisUtils {

    //提供了一个定时任务用于模拟库存的使用，这样方便我们在测试的时候可以观察到库存的变化
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    private AtomicInteger stock = new AtomicInteger(0);

    public RedisUtils() {
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            // 模拟库存消耗
            stock.addAndGet(1);
        }, 0, 100000, TimeUnit.MICROSECONDS);
    }

    public int getStockUsed() {
        return stock.get();
    }

}

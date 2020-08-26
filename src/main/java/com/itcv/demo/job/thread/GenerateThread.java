package com.itcv.demo.job.thread;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class GenerateThread implements Callable {
    private CountDownLatch countDownLatch;
    private Map<String, Object> condition;

    public GenerateThread(CountDownLatch countDownLatch,Map<String, Object> condition){
        this.countDownLatch = countDownLatch;
        this.condition = condition;
    }
    @Override
    public Object call() throws Exception {
        long start = System.currentTimeMillis();
        String ss  =  condition.get("orgCode").toString();
        return null;
    }
}

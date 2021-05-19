package com.itcv.demo.thread;

/**
 * @program: redisdemo
 * @description:
 * @author: zf
 * @create: 2020-07-01 16:56
 */
public class ThreadDemo implements Runnable {
    private Integer num;

    public ThreadDemo(Integer num){
        this.num = num;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"正在执行。。。。。");
            // System.out.println(num);
           Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
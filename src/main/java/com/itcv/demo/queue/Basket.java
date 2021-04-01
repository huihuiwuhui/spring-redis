package com.itcv.demo.queue;

import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;


/**
 *
 * 定义一个容器篮子
 */
public class Basket {

    //定义篮子的大小
    // 篮子，能够容纳3个苹果
    BlockingQueue<String> basket = new ArrayBlockingQueue<String>(4);
    private static String [] fruits = new String[] {"苹果","香蕉","橘子","西瓜"};
    private static volatile int i =0;

    //摘取苹果放入篮子
    public  void pruduce(String apple){
        ReentrantLock lock = new  ReentrantLock();
        lock.lock();
        i++;
        if(i==4){
            i=0;
        }
        basket.add(apple);
        lock.unlock();
       // basket.put(apple);
      //  basket.offer(apple);
    }
    public String consumer(){
        ReentrantLock lock = new  ReentrantLock();
        lock.lock();
        i--;
        if(basket.size()==0){
           // Thread.currentThread().wait();
        }
        if(i==-1){
            i=4;
        }
       String consumer =  basket.poll();
        lock.unlock();
        return consumer;
      //  return basket.take();
    }

    public static void main(String[] args) {
        Basket b = new Basket();
        while (true) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                   // i++;
                    System.out.println("生产了" + fruits[i]);
                    b.pruduce(fruits[i]);
                    System.out.println("i");
                }
            });

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    //i--;
                    String fruit = b.consumer();
                    System.out.println("消费了" + fruit);

                }
            });
            //LinkedHashMap
            t1.start();
            t2.start();
        }
    }


}

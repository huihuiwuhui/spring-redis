package com.itcv.demo.thread;

import sun.misc.Unsafe;
import sun.nio.ch.ThreadPool;

import java.util.Date;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: redisdemo
 * @description:
 * @author: zf
 * @create: 2020-07-01 16:57
 */
public class ThreadTestMain {
    private static  volatile AtomicInteger i = new AtomicInteger();

    //核心线程数为2,最大线程数为4，队列大小为2
    //执行过程：先有2个任务执行,第三个任务进来发现等于核心线程数，入队列等待,队列中可以存2个任务,如果再有
    //任务进来发现队列满了，会建2个非核心线程数执行任务,再有任务进来就会交给handler处理
    private static  final ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,100, TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>(2),new ThreadPoolExecutor.CallerRunsPolicy()
    );


    public static void main(String[] args) throws Exception{

        ExecutorService pool=Executors.newSingleThreadExecutor();
        for(int j=0;j<10;j++){

            Runnable work = new ThreadDemo(i.get());
            pool.execute(work);
           // executor.execute(work);
        //   Future future = executor.submit(work);
        //   System.out.println(future.get());
           // executor.shutdown();
            i.addAndGet(1);
            //executor.getQueue().stream().forEach();
        }
        System.out.println("执行结束了"+new Date());



      /*  System.out.println("执行结束了"+ new Date());
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        System.out.println(t1==t2);
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        Unsafe unsafe = Unsafe.getUnsafe();
        System.out.println("锁上了");*/



    }
}
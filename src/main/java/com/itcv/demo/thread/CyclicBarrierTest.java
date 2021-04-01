package com.itcv.demo.thread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    /**
     * 对于CyclicBarrier，假设有一家公司要全体员工进行团建活动，活动内容为翻越三个障碍物，每一个人翻越障碍物所用的时间是不一样的。
     * 但是公司要求所有人在翻越当前障碍物之后再开始翻越下一个障碍物，也就是所有人翻越第一个障碍物之后，才开始翻越第二个，以此类推。
     * 类比地，每一个员工都是一个“其他线程”。当所有人都翻越的所有的障碍物之后，程序才结束。而主线程可能早就结束了，这里我们不用管主线程。
     * @param args
     */
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(4); //4个员工
        for (int i=0;i<barrier.getParties();i++){
            new Thread(new ActivityThread(barrier),"员工"+i).start();
        }
    }

    public static class ActivityThread implements Runnable{
        CyclicBarrier barrier;
        public ActivityThread(CyclicBarrier barrier){
            this.barrier = barrier;
        }
        @Override
        public void run() {
            try {
                for(int i =0;i<3;i++){ //3个障碍物
                    Random random = new Random();
                    int activityTime =  random.nextInt(3000-2000+1)+1000;
                    System.out.println(Thread.currentThread().getName()+"翻越了第"+i+"个障碍物，耗时"+((double)activityTime/1000)+"s");
                    barrier.await();//等待其它人翻越障碍物
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}

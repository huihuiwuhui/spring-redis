package com.itcv.demo.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    /**
     * 对于CountDownLatch，其他线程为游戏玩家，比如英雄联盟，主线程为控制游戏开始的线程。在所有的玩家都准备好之前，
     * 主线程是处于等待状态的，也就是游戏不能开始。当所有的玩家准备好之后，下一步的动作实施者为主线程，即开始游戏。
     * @param args
     */
    public static void main(String[] args) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(4);
            for(int i =0;i<countDownLatch.getCount();i++){ //玩家准备
               new Thread(new PlayerThread(countDownLatch),"player"+i).start();
            }
            System.out.println("玩家正在进入游戏");
            countDownLatch.await(); //当所有玩家准备就绪
            System.out.println("开始游戏");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class PlayerThread implements Runnable{
             private CountDownLatch countDownLatch;
             private PlayerThread(CountDownLatch countDownLatch){
                 this.countDownLatch = countDownLatch;
             }

        @Override
        public void run() {
            try {
                Random random = new Random();
                int sleepTime = random.nextInt(3000-1000)+1000+1;
                Thread.sleep(sleepTime);
                System.out.println(Thread.currentThread().getName()+"已经准备好了，耗时"+(double)(sleepTime/1000)+"s");
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.itcv.demo.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
     int n =8;
        Semaphore semaphore = new Semaphore(5); //机器数
     for(int i =0;i<n;i++){
        new Worker(i,semaphore).start();
     }
    }

   static class Worker extends Thread{
      private int n;
      private Semaphore semaphore;
      public  Worker(int n,Semaphore semaphore){
          this.n = n;
          this.semaphore = semaphore;
      }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("工人"+this.n+"占用一个机器在生产...");
                Thread.sleep(2000);
                System.out.println("工人"+this.n+"释放出机器");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

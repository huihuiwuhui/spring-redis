/*
package com.itcv.demo.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.elasticjob.lite.annotation.ElasticSimpleJob;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
@ElasticSimpleJob(cron="0 0/1 * * * ?",shardingTotalCount=1,shardingItemParameters="0=A")
public class JobDemoTask implements SimpleJob {

    @Value("#{'${finance.orgList}'.split(',')}")
    private  List<String> orgList;


    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("我执行了。。。。。");
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(orgList.size());
        System.out.println(orgList.size());

        for(String org : orgList){
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("开始执行了线程方法"+org);
                        Thread.sleep(1000);
                        System.out.println(org+"执行了哇咔咔"+org);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

        }
        fixedThreadPool.shutdown();
    }
}
*/

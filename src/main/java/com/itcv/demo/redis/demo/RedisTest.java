package com.itcv.demo.redis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisTest {

    @Autowired
    private static RedisTemplate redisTemplate;

    public static void main(String[] args) {
         test();
    }

    public static void test(){
        Object key2 = redisTemplate.opsForValue().get("key2");
        System.out.println(key2);
    }
}

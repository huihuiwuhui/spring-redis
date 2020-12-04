package com.itcv.demo.controller;

import com.itcv.demo.annotation.ControllerLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/")
    @ControllerLog(description = "我是描述",module = "我是模块", opType = "我是类型")
    @ResponseBody
    public void say() {

        Map<String, Object> map = new HashMap<>();
        map.put("id", "456");
        map.put("id1", "456");
        map.put("id2", "456");
        map.put("id3", "456");
        map.put("id4", "456");
        map.put("id5", "456");
        map.put("id6", "456");
        map.put("id7", "456");
        map.put("id8", "456");
        map.put("id9", "456");
        map.put("id10", "456");
        map.put("id11", "456");
        map.put("id12", "456");


        System.out.println("=========");
    }
}

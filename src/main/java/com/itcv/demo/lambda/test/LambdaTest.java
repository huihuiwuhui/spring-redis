package com.itcv.demo.lambda.test;

import com.itcv.demo.lambda.po.Apple;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @program: redisdemo
 * @description:
 * @author: zf
 * @create: 2020-06-26 17:29
 */
public class LambdaTest {
    public static List<Apple> appleList = new ArrayList<>();

    public static void main(String[] args) {
        initTestData();
        appleList.stream().forEach(apple -> System.out.println(apple.toString()));
        System.out.println("============================================================");
       // List<Apple> resultList = filterApples(appleList,Apple ::isGreenApple); // first
      /*  List<Apple> resultList = filterApples(appleList, (Apple a) -> a.getWeight().compareTo(new BigDecimal("80"))>0 &&  //second
                "green".equals(a.getColor()) );*/
        List<Apple> resultList  = appleList.stream().filter((Apple a) -> a.getWeight().compareTo(new BigDecimal("150"))>0)
                .collect(Collectors.toList());


       resultList.stream().forEach(apple -> System.out.println(apple.toString()));

    }

    static void initTestData(){
        for(int i =0;i<10;i++){
            Apple apple = new Apple();
            if(i%2==0){
                apple.setColor("red");
                apple.setWeight(new BigDecimal("150").add(new BigDecimal(i)));
            }else{
                apple.setColor("green");
                apple.setWeight(new BigDecimal("150").subtract(new BigDecimal(i)));
            }
            appleList.add(apple);
        }
    }

    /**
     * 传统过滤方法
     * @param inventory
     * @return
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
         for (Apple apple: inventory){
                if ("green".equals(apple.getColor())) {
                    result.add(apple);
                }
            }
     return result;
    }

    /**
     * lambda 第一种过滤方式
     * @param inventory
     * @param p
     * @return
     */
    public static List<Apple> filterApples(List<Apple> inventory,Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
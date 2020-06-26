package com.itcv.demo.lambda.po;

import java.math.BigDecimal;

/**
 * @program: redisdemo
 * @description: 实体类
 * @author: zf
 * @create: 2020-06-26 17:28
 */
public class Apple {

    private String color;

    private BigDecimal weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }
    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight().compareTo(new BigDecimal("150"))>0;
    }

    public  String toString(){
      return "color : " + this.color + ", weight : "+weight+";";
    }
}
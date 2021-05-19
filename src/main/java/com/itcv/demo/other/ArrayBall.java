package com.itcv.demo.other;

import java.util.ArrayList;
import java.util.List;

public class ArrayBall {

    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };


    public static void main(String[] args) {
        ArrayBall ex = new ArrayBall();
        String str = "good";
        ex.change(str, ex.ch);
        System.out.print(str + " and ");
        System.out.print(ex.ch);

    }
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }






}

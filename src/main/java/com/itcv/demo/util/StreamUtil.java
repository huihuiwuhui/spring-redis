package com.itcv.demo.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: redisdemo
 * @description: java流编程
 * @author: zf
 * @create: 2020-06-24 09:58
 */
public class StreamUtil {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(null);
        //list.stream().forEach(str -> System.out.println(str));
        list.stream().peek(str -> System.out.println(str)).collect(Collectors.toList());

        File [] hiddenFiles = new File("G:").listFiles(File::isFile);
        System.out.println(hiddenFiles);
    }
}
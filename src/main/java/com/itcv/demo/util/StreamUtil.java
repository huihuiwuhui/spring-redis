package com.itcv.demo.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.net.URLClassLoader;
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
        URL url = null;
        List<ClassLoader> classLoaderList = new ArrayList<ClassLoader>();
        try {
            //获取有关类型加载的JMX接口
            ClassLoadingMXBean loadingBean = ManagementFactory.getClassLoadingMXBean();
            url = new File("E:/data/logs").toURI().toURL();
            URL[] urls = {url};
            while (true){
                ClassLoader loader = new URLClassLoader(urls);
                Class<?> clazz = loader.loadClass("Persion");
                clazz.getName();
                classLoaderList.add(loader);
                //显示数量信息（共加载过的类型数目，当前还有效的类型数目，已经被卸载的类型数目）
                System.out.println("total: "+ loadingBean.getTotalLoadedClassCount());
                System.out.println("active: "+ loadingBean.getLoadedClassCount());
                System.out.println("unloaded: "+ loadingBean.getUnloadedClassCount());
                Thread.sleep(100);
                // System.out.println(classLoaderList.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
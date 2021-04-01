package com.itcv.demo.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
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

    private static String path = "http://okzy.xzokzyzy.com/20200820/20513_6741611c/%E5%85%AB%E4%BD%B0.mp4";
    private static final int threadCount = 10;

    public static void main(String[] args) {

        /*try {
            URL url = new URL("http://okzy.xzokzyzy.com/20200820/20513_6741611c/%E5%85%AB%E4%BD%B0.mp4");
            URLConnection con = url.openConnection();
            FileOutputStream out = new FileOutputStream("d:/八佰.mp4");
            InputStream ins = con.getInputStream();
            byte[] b = new byte[1024];
            int i=0;
            while((i=ins.read(b))!=-1){
                out.write(b, 0, i);
            }
            ins.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                int contentLength = conn.getContentLength();
                System.out.println("length" + contentLength);

                RandomAccessFile rafAccessFile = new RandomAccessFile("d:/八佰.mp4", "rw");
               // rafAccessFile.setLength(contentLength);

                int blockSize = contentLength / threadCount;
                for (int i = 0; i < threadCount; i++) {
                    int startIndex = i * blockSize; //每个现成下载的开始位置
                    int endIndex = (i + 1) * blockSize - 1;// 每个线程的结束位置
                    if (i == threadCount - 1) {
                        //最后一个线程
                        endIndex = contentLength - 1;
                    }

                    new DownloadThread(startIndex, endIndex, i).start();
                }

            }
        } catch (Exception e) {

        }
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(null);
        //list.stream().forEach(str -> System.out.println(str));
        list.stream().peek(str -> System.out.println(str)).collect(Collectors.toList());

        File [] hiddenFiles = new File("G:").listFiles(File::isFile);
        System.out.println(hiddenFiles);
    }

    private static class DownloadThread extends Thread {
        private int startIndex;
        private int endIndex;
        private int threadId;

        public DownloadThread(int startIndex, int endIndex, int threadId) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.threadId = threadId;
        }

        @Override
        public void run() {
            try {
                URL url = new URL(path);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(5000);
                conn.setRequestProperty("Range", "bytes=" + startIndex + "-" + endIndex); //固定写法，请求部分资源
                int responseCode = conn.getResponseCode(); // 206表示请求部分资源
                if (responseCode == 206) {
                    RandomAccessFile rafAccessFile = new RandomAccessFile("d:/八佰.mp4", "rw");
                    rafAccessFile.seek(startIndex);
                    InputStream is = conn.getInputStream();
                    int len = -1;
                    byte[] buffer = new byte[102400];
                    while ((len = is.read(buffer)) != -1) {
                        rafAccessFile.write(buffer, 0, len);
                    }
                    rafAccessFile.close();

                    System.out.println("线程" + threadId + "下载完成");
                }
            } catch (Exception e) {

            }
        }
    }
}
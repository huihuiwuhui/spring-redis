package com.itcv.demo.redis.client;

import java.io.IOException;
import java.net.Socket;

public class TSocketClient {
    // 定义socket

    private Socket socket;

    public TSocketClient() {
        try {
            socket = new Socket("localhost", 6379);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String set(final String key, final String value) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("*3").append("\r\n");
        sb.append("$3").append("\r\n");
        sb.append("set").append("\r\n");
        sb.append("$").append(key.getBytes().length).append("\r\n");
        sb.append(key).append("\r\n");
        sb.append("$").append(value.getBytes().length).append("\r\n");
        sb.append(value).append("\r\n");
        socket.getOutputStream().write(sb.toString().getBytes());
        byte[] b = new byte[2048];
        socket.getInputStream().read(b);
        return new String(b);
    }

    public String get(final String key) throws IOException {

        StringBuilder sb = new StringBuilder();

        sb.append("*2").append("\r\n"); // *表示数组 后面数字表示数组长度

        sb.append("$3").append("\r\n");

        sb.append("get").append("\r\n");

        sb.append("$").append(key.getBytes().length).append("\r\n"); // 美元符号表示字符串，后面的数字表示长度
        sb.append(key).append("\r\n");

        socket.getOutputStream().write(sb.toString().getBytes());

        byte[] b = new byte[2048];

        socket.getInputStream().read(b);
        return new String(b);
    }

    public static void main(String[] args) throws IOException {
        TSocketClient client = new TSocketClient();
        String str = client.set("hello", "ziyan");
        System.out.println(str);
    }
}
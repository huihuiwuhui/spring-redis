package com.itcv.demo.data.structure.second;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TreeNode {

    private TreeNode LChildNode;
    private TreeNode RChildNode;
    private String data;

    public TreeNode(String data){
        this.data = data;
        this.LChildNode = null;
        this.RChildNode = null;
    }

    public static void main(String[] args) {
       // Integer num = 2147483647;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //1.查询机构数据
        long startTime = System.currentTimeMillis();
        Calendar cal3 = Calendar.getInstance();
        cal3.add(Calendar.DATE,-1);
        String endTimeStr = dateFormat.format(cal3.getTime());
        System.out.println(endTimeStr);
        //当月第一天
       // Calendar cal1 = Calendar.getInstance();
        cal3.set(Calendar.DAY_OF_MONTH, 1);
        Date date = cal3.getTime();
        String firstDate = dateFormat.format(date);
        System.out.println(firstDate);

        System.out.println(2 >>> 1);
        System.out.println(2 >>> 2);
        System.out.println(2 >>> 3);
        System.out.println(16 >>> 16);
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
        try {
            say();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String,String> testMap = new HashMap<>();
        for(int i =0;i<1355;i++){
            if(i==6){
                System.out.println("===========");
            }
           // testMap.put(i+"key","bbb");
            String key = (i+"key");
            int n = 16;
            int hash = hash(key);
            int p =  (n - 1) & hash;
            if(p==3){
                System.out.println(i+"的hash为"+p);

                if(testMap.size()==63){
                    System.out.println("娃娃哇哇哇"+i);
                }
                testMap.put(i+"key","bbb");
            }

        }
       /* testMap.put(5+"key","bbb");
        testMap.put(6+"key","bbb");
        testMap.put(38+"key","bbb");
        testMap.put(39+"key","bbb");
        String value =  testMap.put(63+"key","bbb");
        testMap.put(64+"key","bbb");
        testMap.put(115+"key","bbb");
        testMap.put(116+"key","bbb");
        testMap.put(140+"key","bbb");
        testMap.put(1416+"key","bbb");*/
        int h=0;
        h = "130".hashCode();
        System.out.println(h);
       int j =  h ^ (h >>> 16);
       System.out.println(j);

        System.out.println(testMap);



    }

    static void say()throws Exception{
        int i =100;
        int j =0;
        try {
            int num = i/j;
            System.out.println(num);
        } catch (Exception e) {
            throw e;
            //e.printStackTrace();
        }

    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}

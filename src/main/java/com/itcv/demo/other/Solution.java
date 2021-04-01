package com.itcv.demo.other;

public class Solution {

   /* 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
    如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
    假设环境不允许存储 64 位整数（有符号或无符号）。
    输入：x = 123
    输出：321*/
   static long result = 0;
   public static void main(String[] args) {
       int x =1534236469;
       long result =0;




       long j = sum(x);

           System.out.println(j);


      /* long n = 0;
       while(x != 0) {
           n = n*10 + x%10;
           x = x/10;
       }

       n = 0+3;
       x = 12;
       n = 30+2;*/



  //     System.out.println(x%10);
   }

   private static long sum(int n){
        int q =n;
       if(q!=0){
         int p = n%10;
         result = result*10+p;
         q =  n/10;
            // System.out.println(result);
           return sum(q);
         }
       return result;

   }

}

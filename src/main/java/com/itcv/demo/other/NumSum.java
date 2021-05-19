package com.itcv.demo.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NumSum {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int[] a = new int[3];
                a[0] = 0;
                 a[1] = 1;
                 a[2] = 2;
                 int[] b = Arrays.copyOf(a, 10);
                 System.out.println("b.length"+b.length);


        System.out.println(Math.max(4,5));
        list.add(1);
        ListNode listNode = new ListNode();
        listNode.val =9;

        listNode.next= listNode;
    }




     public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }

       public void add(ListNode listNode){
              this.next = listNode;
       }
   }

}

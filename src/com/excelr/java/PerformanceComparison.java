package com.excelr.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceComparison {
    public static void main(String[] args) {
        int num = 100000;
        List<Integer> arrList = new ArrayList<>();
        System.out.println("ArrayList Test: ");
        testSpeed(arrList,num);

        List<Integer> linkList = new LinkedList<>();
        System.out.println("LinkedList: ");
        testSpeed(linkList,num);

    }

    private static void testSpeed(List<Integer> list, int num) {
        long start = System.nanoTime();
        for(int i = 0; i< num ; i++){
            list.add(0,i);
        }
        long end = System.nanoTime();
        System.out.println("speed at beginning: " + (end - start)/1_000_000 + " ms");

        list.clear();

        start = System.nanoTime();
        for (int i = 0; i< num ; i++){
            list.add(i);
        }
        end = System.nanoTime();
        System.out.println("speed at end: " + (end - start)/1_000_000 + " ms");

        start = System.nanoTime();
        for(int i = 0 ; i< num ; i++){
            list.add(list.size()/2,i);
        }
        end = System.nanoTime();
        System.out.println("speed at middle: " + (end - start)/1_000_000 + " ms");

    }
}

package com.excelr.java;

import java.util.PriorityQueue;

public class PriorityQueueRetrieve {

    public static void main(String[] args) {

        PriorityQueue<Integer> num = new PriorityQueue<>();

        num.add(15);
        num.add(3);
        num.add(20);
        num.add(5);
        num.add(9);
        num.add(25);

        System.out.println(num);
        System.out.println("----------------");
        System.out.println(num.peek());
        System.out.println("----------------");

        while (!num.isEmpty()) {
            System.out.println(num.poll());
        }
    }
}
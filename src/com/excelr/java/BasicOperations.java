package com.excelr.java;

import java.util.ArrayList;

public class BasicOperations {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(5);
        System.out.println(num);
        num.add(4,4);
        System.out.println(num);
        num.add(5,9);
        System.out.println(num);
        num.remove(4);
        System.out.println(num);
        num.add(3,7);
        System.out.println(num);
        num.set(2,9);
        System.out.println(num);
    }
}

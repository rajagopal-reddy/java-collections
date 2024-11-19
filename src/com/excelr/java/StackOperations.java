package com.excelr.java;

import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();

        num.push(1);
        num.add(2);
        num.add(6);
        num.add(4);
        num.add(5);
        num.add(3);
        num.add(7);
        num.add(8);
        num.add(9);
        System.out.println(num);

        while (!num.isEmpty()){
            System.out.println(num.pop());
        }

        System.out.println(num);
    }
}

package com.excelr.java;

import java.util.ArrayDeque;
import java.util.Collections;

public class DequeManipulation {
    public static void main(String[] args) {
        ArrayDeque<String> items = new ArrayDeque<>();
        items.addFirst("fruits");
        items.addLast("appleJuice");
        items.addLast("bananaJuice");
        items.addFirst("apple");
        items.addFirst("banana");
        items.add("applePeal");
        items.add("bananaPeal");

        System.out.println(items);

        while (!items.isEmpty()) {
            if (!items.isEmpty()){
                System.out.println("Removing from front: " + items.pollFirst());
                System.out.println("after removing: " + items);
            }
            if (!items.isEmpty()){
                System.out.println("Removing from back: " + items.pollLast());
                System.out.println("after removing: " + items);
            }
        }
        System.out.println(items);
    }
}

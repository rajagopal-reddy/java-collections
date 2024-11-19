package com.excelr.java;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String items = scanner.nextLine();
        HashMap<String, Integer> fruits = new HashMap<>();

        for(String fruit : items.trim().split(" ")){
            fruits.put(fruit,fruits.getOrDefault(fruit,0)+1);
        }

        System.out.println(fruits);

        int count = 0;

        for (var value: fruits.entrySet()) {

            System.out.println(value.getKey() + " = " + value.getValue());
            count++;
        }
        System.out.println("Number of Words: " + count);
    }
}

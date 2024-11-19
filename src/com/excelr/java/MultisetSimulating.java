package com.excelr.java;

import java.util.*;

public class MultisetSimulating {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(List.of(1,2,3,4,5,6,3,6,8,9,7,4,1,2,7));
        System.out.println(num);

        Set<Integer> elements = new HashSet<>();

        for(Integer n : num){
            if (!elements.contains(n)) {
                int frequency = Collections.frequency(num, n);
                System.out.println(n + " = " + frequency);
                elements.add(n);
            }
        }
    }
}
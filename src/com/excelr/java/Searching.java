package com.excelr.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Searching {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(num.contains(5));

        Iterator<Integer> it = num.iterator();
        while (it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }

    }
}

package com.excelr.java;

import java.util.HashMap;

public class KeyValuePairs {
    public static void main(String[] args) {
        HashMap <Integer,String> map = new HashMap<>();
        map.put(110,"banana");
        map.put(111,"mango");
        map.put(112,"apple");
        map.put(113,"grape");
        map.put(114,"papaya");
        map.put(115,"pineapple");
        System.out.println(map);
//        for (int i = 110; i<map.size();i++){
//            System.out.println(map.get(i));
//        }
        for(Integer key: map.keySet()){
            System.out.println(map.get(key));
        }
        for(var entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
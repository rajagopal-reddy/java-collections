package com.excelr.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedDataStructures {
    public static void main(String[] args) {
        HashMap<String, List<String>> items = new HashMap<>();

        List<String> fruits = new ArrayList<>(List.of("apple","banana","orange"));

        List<String> veges = new ArrayList<>(List.of("carrot","cucumber","radish"));

        List<String> snacks = new ArrayList<>(List.of("chips","biscuits","cakes"));

        items.put("fruits", fruits);
        items.put("veges", veges);
        items.put("snacks", snacks);

        System.out.println(items);

        for(Map.Entry<String,List<String>> item:items.entrySet()){
            System.out.println(item.getKey() + " = " + item.getValue());
        }
    }
}

package com.excelr.java;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingAndSorting {
    public static void main(String[] args) {
        LinkedList <String> names = new LinkedList<>();
        names.add("Gopal");
        names.add("Haru");
        names.add("Ajay");
        names.add("Sachin");
        names.add("Messy");
        names.add("Dhoni");

        for(int i = 0 ; i< names.size();i++){
            System.out.println(names.get(i));
        }

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }

        for(String name : names){
            System.out.println(name);
        }

    }
}

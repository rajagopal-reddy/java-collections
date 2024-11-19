package com.excelr.java;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.id,employee.id);
    }

    @Override
    public String   toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class CustomComparator {
    public static void main(String[] args) {
        TreeSet<Employee> tree = new TreeSet<>();
        tree.add(new Employee(101,"Mukesh"));
        tree.add(new Employee(102,"Rajesh"));
        tree.add(new Employee(103,"Mohan"));
        tree.add(new Employee(104,"Raju"));
        tree.add(new Employee(105,"Paul"));
        tree.add(new Employee(106,"John"));
        tree.add(new Employee(107,"Bobby"));
        tree.add(new Employee(108,"Loki"));
        tree.add(new Employee(109,"Gopal"));
        tree.add(new Employee(100,"Rahul"));

        System.out.println(tree);

        for (Employee emp : tree){
            System.out.println(emp);
        }

        TreeSet<Employee> newTree = new TreeSet<>((e1,e2) -> -e1.getName().compareTo(e2.getName()));
        newTree.addAll(tree);

        for (Employee emp : newTree){
            System.out.println(emp);
        }
    }
}
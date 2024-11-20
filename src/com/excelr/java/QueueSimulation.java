package com.excelr.java;

import java.util.LinkedList;
import java.util.Queue;

class User{
    int id;
    String name;

    public User(int id, String name) {
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
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class QueueSimulation {
    public static void main(String[] args) {
        Queue<User> users = new LinkedList<>();

        users.add(new User(1,"Gopal"));
        users.add(new User(2,"Rajiv"));
        users.add(new User(3,"Tarun"));
        users.add(new User(4,"Teja"));
        users.add(new User(5,"Mukesh"));
        users.add(new User(6,"Rahul"));
        users.add(new User(7,"Anna"));

        while (!users.isEmpty()){
            User user = users.poll();
            System.out.println("Served: " + user.getId() + " " + user.getName());
            System.out.println("Remaining: " + users);
        }
    }
}

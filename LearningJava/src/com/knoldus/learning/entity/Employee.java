package com.knoldus.learning.entity;

public class Employee {
    int id;
    String name;
    public static int count;

    public Employee(int i, String s) {
        this.id=i;
        this.name=s;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

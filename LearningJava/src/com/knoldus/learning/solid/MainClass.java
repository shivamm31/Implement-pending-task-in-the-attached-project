package com.knoldus.learning.solid;

public class MainClass {

    public static void main(String [] a){
        Vehicle v = new Car();
        v.startEngine();

        Vehicle b = new BiCycle();
        b.startEngine();
    }
}

package com.example.beans;


public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component vehicle Bean");
    }

    public void initialize(){
        this.name = "Ferrari";
    }
    public void destroy(){
        System.out.println("Destroying vehicle bean");
    }
}

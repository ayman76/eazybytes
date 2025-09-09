package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        System.out.println("Vehicle name with Init-method and destroy-method from Spring Xml Context is: " + vehicle.getName());

        Vehicle vehicle2 = context.getBean("vehicle2", Vehicle.class);
        System.out.println("Vehicle name from Spring Xml Context is: " + vehicle2.getName());
        context.close();

    }
}

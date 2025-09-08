package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle Name from spring context is: " + vehicle1.getName());

        Vehicle vehicle2 = context.getBean("vehicle2",Vehicle.class);
        System.out.println("Vehicle Name from spring context is: " + vehicle2.getName());

        Vehicle vehicle3 = context.getBean("vehicle3",Vehicle.class);
        System.out.println("Vehicle Name from spring context is: " + vehicle3.getName());

    }
}

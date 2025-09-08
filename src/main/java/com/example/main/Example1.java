package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle Name from non-spring context is: " + vehicle.getName());


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle Name from spring context is: " + vehicle1.getName());

        String text = context.getBean(String.class);
        System.out.println("String from spring context is: " + text);

        Integer number = context.getBean(Integer.class);
        System.out.println("Integer from spring context is: " + number);
    }
}

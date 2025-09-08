package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle audiVehicle = context.getBean("AudiVehicle",Vehicle.class);
        System.out.println("Vehicle Name from spring context is: " + audiVehicle.getName());

        Vehicle hondaVehicle = context.getBean("HondaVehicle",Vehicle.class);
        System.out.println("Vehicle Name from spring context is: " + hondaVehicle.getName());

        Vehicle ferrariVehicle = context.getBean("FerrariVehicle",Vehicle.class);
        System.out.println("Vehicle Name from spring context is: " + ferrariVehicle.getName());

    }
}

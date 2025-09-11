package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        Person person = context.getBean("person", Person.class);

        System.out.println("Person name from Spring context: " + person.getName());
        System.out.println("Vehicle name from Spring context: " + vehicle.getName());
        System.out.println("Vehicle that person own: " + person.getVehicle());

    }
}

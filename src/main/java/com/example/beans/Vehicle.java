package com.example.beans;


import com.example.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component vehicle Bean");
    }

    @Override
    public String toString() {
        return "Vehicle name: "+ name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
}

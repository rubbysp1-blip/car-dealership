package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        inventory = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByPrice(BigDecimal min, BigDecimal max){

        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color, String max){
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }

    public void addVehicle(Vehicle vehicle){

    }

    public void removeVehicle(Vehicle vehicle){

    }
}

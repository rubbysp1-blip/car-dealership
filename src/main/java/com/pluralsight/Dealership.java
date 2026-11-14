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
        this.inventory = new ArrayList<Vehicle>();
    }

    public Dealership() {
        this.inventory = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getVehiclesByPrice(BigDecimal min, BigDecimal max){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if((min == null || vehicle.getPrice().compareTo(min) >= 0) && (max == null || vehicle.getPrice().compareTo(max) <= 0)){
                vehicleList.add(vehicle);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if(vehicle.getMake().equalsIgnoreCase(make)){
                vehicleList.add(vehicle);
            }
            if(vehicle.getModel().equalsIgnoreCase(model)){
                vehicleList.add(vehicle);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if((min == 0 || vehicle.getYear() >= min) && (max == 0 || vehicle.getYear() <= max)){
                vehicleList.add(vehicle);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if(vehicle.getColor().equalsIgnoreCase(color)){
                vehicleList.add(vehicle);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if((min == 0 || vehicle.getOdometer() >= min) && (max == 0 || vehicle.getOdometer() <= max)){
                vehicleList.add(vehicle);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        for (Vehicle vehicle : inventory){
            if(vehicle.getVehicleType().equalsIgnoreCase(vehicleType)){
                vehicleList.add(vehicle);
            }
        }
        return vehicleList;
    }

    public List<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.inventory.remove(vehicle);
    }

    @Override
    public String toString() {
        return name + "|" + address + "|" + phone;
    }
}

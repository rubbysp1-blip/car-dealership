package com.pluralsight;

import java.math.BigDecimal;
//Hold Information about a specific vehicle
public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private BigDecimal price;

    public Vehicle(BigDecimal price, int odometer, String color, String vehicleType, String model, String make, int year, int vin) {
        this.price = price;
        this.odometer = odometer;
        this.color = color;
        this.vehicleType = vehicleType;
        this.model = model;
        this.make = make;
        this.year = year;
        this.vin = vin;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + year + " " + make + " " + model + "\n" +
                "VIN: " + vin + "\n" +
                vehicleType + " | " + color + " | " + odometer + " miles\n" +
                "Price: $" + String.format("%.2f", price) + "\n";

    }
}

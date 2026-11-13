package com.pluralsight;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static Scanner input = new Scanner(System.in);

    private Dealership dealership;

    public UserInterface() {
    }

    private void displayVehicles(List<Vehicle> vehicleList){

        if(vehicleList.isEmpty()){
            System.out.println("No vehicles were found!");
        }else {
            for (Vehicle vehicle : vehicleList) {
                System.out.println(vehicle);
            }
        }
    }

    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();

        this.dealership = fileManager.getDealership();

    }

    public void display(){

        init();
        System.out.println("Welcome to " + dealership.getName() + "\n");
        while (true){
            System.out.print("""
                    Select a Number From The Following Options
                    ------------------------------------------
                    1 - Find vehicles within a price range
                    2 - Find vehicles by make / model
                    3 - Find vehicles by year range
                    4 - Find vehicles by color
                    5 - Find vehicles by mileage range
                    6 - Find vehicles by type (car, truck, SUV, van)
                    7 - List ALL vehicles
                    8 - Add a vehicle
                    9 - Remove a vehicle
                    99 - Quit
                    Enter Option:\s""");

            int command = input.nextInt();
            input.nextLine();//consumes the CRLF

            switch (command){
                case 1-> processGetByPriceRequest();
                case 2-> processGetByMakeModelRequest();
                case 3-> processGetByYearRequest();
                case 4-> processGetByColorRequest();
                case 5-> processGetByMileageRequest();
                case 6-> processGetByVehicleTypeRequest();
                case 7-> processGetByAllVehiclesRequest();
                case 8-> processAddVehicleRequest();
                case 9-> processRemoveVehicleRequest();
                case 99-> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }

            }
        }

    }

    public void processGetByPriceRequest(){
        System.out.print("Enter Minimum Price Range: ");
        BigDecimal min = input.nextBigDecimal();
        input.nextLine();
        System.out.print("Enter Maximum Price Range: ");
        BigDecimal max = input.nextBigDecimal();
        input.nextLine();
        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

    public void processGetByMakeModelRequest(){
        System.out.print("Enter Vehicle Make: ");
        String make = input.nextLine().trim();
        //input.nextLine();
        System.out.print("Enter Vehicle Model: ");
        String model = input.nextLine().trim();
        input.nextLine();
        displayVehicles(dealership.getVehiclesByMakeModel(make, model));
    }

    public void processGetByYearRequest(){
        System.out.print("Enter Minimum Year Range: ");
        int min = input.nextInt();
        input.nextLine();
        System.out.print("Enter Maximum Year Range: ");
        int max = input.nextInt();
        input.nextLine();
        displayVehicles(dealership.getVehiclesByYear(min, max));
    }

    public void processGetByColorRequest(){
        System.out.print("Enter Vehicle Color: ");
        String color = input.nextLine().trim();
        input.nextLine();
        displayVehicles(dealership.getVehiclesByColor(color));
    }

    public void processGetByMileageRequest(){
        System.out.print("Enter Minimum Mileage Range: ");
        int min = input.nextInt();
        input.nextLine();
        System.out.print("Enter Maximum Mileage Range: ");
        int max = input.nextInt();
        input.nextLine();
        displayVehicles(dealership.getVehiclesByMileage(min, max));
    }

    public void processGetByVehicleTypeRequest(){

    }

    public void processGetByAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());
    }

    public void processAddVehicleRequest(){
        //use dealershipfilemanager
    }

    public void processRemoveVehicleRequest(){

    }
}

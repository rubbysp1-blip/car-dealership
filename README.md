# Car Dealership

This app is to help users to do many functions to find certain 
types of vehicle, delete or add a vehicle to the original file.


## Features

- Find vehicles within a price range
- Find vehicles by make / model
- Find vehicles by year range
- Find vehicles by color
- Find vehicles by mileage range
- Find vehicles by type (car, truck, SUV, van)
- List ALL vehicles
- Add a vehicle
- Remove a vehicle

## How to run it

1. Clone the repository and open it in IntelliJ
2. Run `[App].java`
3. Select a number from the menu

## Screenshots

![The home screen](images/home_screen.png)

## Interesting code

I'm proud of this code because it caused me the most trouble for the smallest
change.

```java
public void saveDealership(Dealership dealership) {
    try {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inventory.csv"));
        bufferedWriter.write(dealership.toString() + "\n");
        for (Vehicle vehicle : dealership.getAllVehicles()) {

            bufferedWriter.write(vehicle.toCSV());

            bufferedWriter.newLine();

        }
        bufferedWriter.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
```

## Author

Ruby Santos, Year Up Java Academy
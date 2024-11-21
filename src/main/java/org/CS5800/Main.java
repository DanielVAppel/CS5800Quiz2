package org.CS5800;

//Main.java
public class Main {
    // The main method, the entry point of the program
    public static void main(String[] args) {
        // Create an instance of Car as a Vehicle
        Vehicle car = new Car();
        // Create an instance of Motorcycle as a Vehicle
        Vehicle motorcycle = new Motorcycle();

        // Create an instance of Truck as a Vehicle
        Vehicle truck = new Truck();

        // Call the startEngine method on the car object
        car.startEngine();
        // Call the stopEngine method on the car object
        car.stopEngine();

        // Call the startEngine method on the motorcycle object
        motorcycle.startEngine();
        // Call the stopEngine method on the motorcycle object
        motorcycle.stopEngine();

        // Call the startEngine method on the car object
        truck.startEngine();
        // Call the stopEngine method on the car object
        truck.stopEngine();
    }
}

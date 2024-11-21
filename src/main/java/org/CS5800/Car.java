package org.CS5800;

// Car.java
// Class Car extending Vehicle
public class Car extends Vehicle implements  Listener{
    // Overriding the startEngine method
    @Override
    public void startEngine() {
        // Printing message to indicate engine start
        System.out.println("Car: Starting the engine...");
    }

    // Overriding the stopEngine method
    @Override
    public void stopEngine() {
        // Printing message to indicate engine stop
        System.out.println("Car: Stopping the engine...");
    }

    @Override
    public void update(Object arg) {

    }
}

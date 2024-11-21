package org.CS5800;

// Car.java
// Class Car extending Vehicle
class Car extends Vehicle {
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
}

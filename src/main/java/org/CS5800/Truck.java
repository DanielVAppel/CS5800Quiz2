package org.CS5800;

class Truck extends Vehicle {
    // Overriding the startEngine method
    @Override
    public void startEngine() {
        // Printing message to indicate engine start
        System.out.println("Motorcycle: Starting the engine...");
    }

    // Overriding the stopEngine method
    @Override
    public void stopEngine() {
        // Printing message to indicate engine stop
        System.out.println("Motorcycle: Stopping the engine...");
    }
}
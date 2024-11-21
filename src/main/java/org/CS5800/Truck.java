package org.CS5800;

public class Truck extends Vehicle implements  Listener{
    // Overriding the startEngine method
    @Override
    public void startEngine() {
        // Printing message to indicate engine start
        System.out.println("Truck: Starting the engine...");
    }

    // Overriding the stopEngine method
    @Override
    public void stopEngine() {
        // Printing message to indicate engine stop
        System.out.println("Truck: Stopping the engine...");
    }

    @Override
    public void update(Object arg) {

    }
}
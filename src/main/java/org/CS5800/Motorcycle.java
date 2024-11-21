package org.CS5800;

// Motorcycle.java
// Class Motorcycle extending Vehicle
public class Motorcycle extends Vehicle implements  Listener{
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

    @Override
    public void update(Object arg) {

    }
}

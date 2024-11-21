package org.CS5800;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VehicleBehavior implements Behavior {

    private final String message;

    public VehicleBehavior(String message) {
        this.message = message;
    }

    public void Main() {
        System.out.println(message);
    }
}


// some hardcoded behaviors:
Behavior aggressiveRed = new VehicleBehavior("Red Light Slam Breaks");
Behavior normalRed = new VehicleBehavior("Red Light Stop");
Behavior passiveRed = new VehicleBehavior("Red Light Stop");
Behavior aggressiveYellow = new VehicleBehavior("Yellow Light Faster");
Behavior normalYellow = new VehicleBehavior("Yellow Light Slow");
Behavior passiveYellow = new VehicleBehavior("Yellow Light Slower");
Behavior aggressiveGreen = new VehicleBehavior("Green Light Need4Speed");
Behavior normalGreen = new VehicleBehavior("Green Light Go");
Behavior passiveGreem = new VehicleBehavior("Green Light Go SLow");


// a user-provided behavior:
BufferedReader userInput = new BufferedReader( new InputStreamReader(System.in) );
System.out.println("Enter text for your custom Vehcile Behavior (nospaces): ");
Behavior customVehicleBehavior = new VehicleBehavior( userInput.readLine() );;

// Create an instance of Car as a Vehicle
Vehicle car = new Car(aggressiveRed);
Vehicle car = new Car(aggressiveYellow);
Vehicle car = new Car(aggressiveGreen);

// Create an instance of Motorcycle as a Vehicle
Vehicle motorcycle = new Motorcycle(normalRed);
Vehicle motorcycle = new Motorcycle(normalYellow);
Vehicle motorcycle = new Motorcycle(normalGreen);

// Create an instance of Truck as a Vehicle
Vehicle truck = new Truck(passiveRed);
Vehicle truck = new Truck(passiveYellow);
Vehicle truck = new Truck(passiveGreem);

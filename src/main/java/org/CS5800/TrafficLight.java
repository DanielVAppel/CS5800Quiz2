package org.CS5800;

public class TrafficLight {

    // Enum to represent the traffic light colors
    enum Color {
        RED, GREEN, YELLOW
    }

    private Color currentColor;

    public TrafficLight() {
        currentColor = Color.RED; // Start with RED
    }

    // Method to change the color of the traffic light
    public void changeColor() {
        switch (currentColor) {
            case RED:
                currentColor = Color.GREEN;
                break;
            case GREEN:
                currentColor = Color.YELLOW;
                break;
            case YELLOW:
                currentColor = Color.RED;
                break;
        }
        System.out.println("The traffic light is now: " + currentColor);
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Run the traffic light in a loop
        while (true) {
            trafficLight.changeColor();
            try {
                Thread.sleep(2000); // Pause for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Traffic light interrupted: " + e.getMessage());
            }
        }
    }
}
package com.lessons.five;

/**
 * @author Keith Banks.
 */
public class Bike implements Vehicle {
    @Override
    public String getName() {
        return "Bike";
    }

    @Override
    public int getMaxSpeed() {
        return 40;
    }

    @Override
    public int getNumberOfPassengers() {
        return 2;
    }

    @Override
    public boolean requiresLicense() {
        return true;
    }
}

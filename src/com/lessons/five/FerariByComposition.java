package com.lessons.five;

/**
 * @author Keith Banks.
 */
public class FerariByComposition implements Vehicle {
    private final Car simpleCar;

    public FerariByComposition(Car simpleCar) {
        this.simpleCar = simpleCar;
    }

    @Override
    public String getName() {
        return "ferari (" + simpleCar.getName() + ')';
    }

    @Override
    public int getMaxSpeed() {
        return 2 * simpleCar.getMaxSpeed();
    }

    @Override
    public int getNumberOfPassengers() {
        return 2;
    }

    @Override
    public boolean requiresLicense() {
        return simpleCar.requiresLicense();
    }

    @Override
    public String getSpeedText() { return " ridiculously fast"; }
}

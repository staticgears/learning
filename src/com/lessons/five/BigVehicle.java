package com.lessons.five;

/**
 * @author Keith Banks.
 */
public abstract class BigVehicle implements Vehicle {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String getSpeedText() {
        if(getMaxSpeed() > 50) {
            return "faster than 50";
        } else {
            return "slower than 50";
        }
    }

    @Override
    public int getMaxSpeed() {
        return 80 / multipler();
    }

    @Override
    public int getNumberOfPassengers() {
        return 2*multipler();
    }

    @Override
    public boolean requiresLicense() {
        return true;
    }

    protected  int multipler() { return 1; }
}

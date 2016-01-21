package com.lessons.five;

/**
 * @author Keith Banks.
 */
public class Bus extends BigVehicle {
    @Override
    public int getMaxSpeed() {
        return 10;
    }

    @Override
    protected int multipler() { return 20; }
}

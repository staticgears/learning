package com.lessons.five;

/**
 * @author Keith Banks.
 */
public abstract interface Vehicle {
    String getName();
    int getMaxSpeed();
    int getNumberOfPassengers();
    boolean requiresLicense();
    default String getSpeedText() { return ""; }
}

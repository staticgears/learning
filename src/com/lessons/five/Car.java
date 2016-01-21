package com.lessons.five;

/**
 * @author Keith Banks.
 */
public class Car implements Vehicle {
    private static final int ORINARY_CAR_SPEED = 15;

    private final String name;
    private final int speed;
    private final int passengers;

    public Car() {
        this("Car", ORINARY_CAR_SPEED, 4);
    }

    private Car(String name, int speed, int passengers) {
        this.name = name;
        this.speed = speed;
        this.passengers = passengers;
    }

    public static Car createFerariUsingFactoryPattern() {
        return new Car("Ferari", 2*ORINARY_CAR_SPEED, 2);
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public int getNumberOfPassengers() {
        return 2;
    }

    @Override
    public boolean requiresLicense() {
        return false;
    }
}

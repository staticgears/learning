package com.lessons.five;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List<Vehicle> types = Arrays.asList(new Car(), new Bike(), new Bus(), new Van(), new MagicBus());

        Car car = new Car();
        Car ferari = Car.createFerariUsingFactoryPattern();
        List<Vehicle> types = Arrays.asList(car, new FerariByComposition(car), new FerariByExtention(), ferari);
        for(Vehicle v : types) {
            planTrip(v, 43, 8);
        }

    }

    public static void planTrip(Vehicle vehicle, int distance, int passengers) {
        if(vehicle.requiresLicense()) {
            System.out.println("Let op, rijbewijs is verplicht");
        }
        double time = 1.0 * distance / vehicle.getMaxSpeed();

        int trips = (int) Math.ceil(1.0*passengers / vehicle.getNumberOfPassengers());
        double totalTime = time * (2*trips - 1);
        System.out.println(String.format("Mode: %s %s, Tijd voor 1-way reis: %.2f,  hele tijd: %.2f op %d reisen\n",
                vehicle.getName(), vehicle.getSpeedText(), time, totalTime, trips));

    }
}


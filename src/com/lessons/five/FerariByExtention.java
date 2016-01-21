package com.lessons.five;

/**
 * @author Keith Banks.
 */
public class FerariByExtention extends Car {
    @Override
    public String getName() { return "FerariByExtention"; }

    @Override
    public int getMaxSpeed(){
        return 2 * super.getMaxSpeed();
    }

    @Override
    public int getNumberOfPassengers() {
        return 2;
    }

}

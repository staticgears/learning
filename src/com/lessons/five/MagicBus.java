package com.lessons.five;

/**
 * @author Keith Banks.
 */
public class MagicBus extends Bus {

    @Override
    public int getMaxSpeed(){
        return 2 * super.getMaxSpeed();
    }
}

package com.lessons.four;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Date: 26/09/15
 *
 * @author keith
 */
public class MyDataStructureIterator implements Iterator<String> {
    private int mycursor;
    private String[] mycopy;

    MyDataStructureIterator(MyDataStructure thing) {
        mycursor = thing.cursor;
        mycopy = Arrays.copyOf(thing.data, thing.data.length);
//        mycopy = new String[thing.data.length];
//        for(int i = 0; i < mycopy.length; i++) {
//            mycopy[i] = thing.data[i];
//        }

    }

    @Override
    public boolean hasNext() {
        return mycursor >= 0;
    }

    @Override
    public String next() {
        if(! hasNext()) {
            throw new NoSuchElementException("bad");
        }
        return mycopy[mycursor--];
    }
}

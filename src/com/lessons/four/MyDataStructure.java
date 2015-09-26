package com.lessons.four;

import java.util.Collection;
import java.util.Iterator;

/**
 * Date: 26/09/15
 *
 * @author kbanks
 */
public class MyDataStructure implements Iterable<String> {
    private int cursor;
    private final String[] data;

    public MyDataStructure() { this(10); }
    public MyDataStructure(int size) {
        cursor = -1;
        data = new String[size];
    }

    public void push(String value) {
        if(cursor > data.length-1) {
            data[++cursor] = value;
        } else {
            throw new IllegalStateException("I am full");
        }
    }

    public String pop() {
        if(isEmpty()) {
            throw new IllegalStateException("attempted to go past the end");
        }
        return data[cursor--];

//        String result = data[cursor];
//        cursor--;
//        return result;
    }

    public boolean isEmpty() { return cursor == -1; }

    public Iterator<String> iterator() {

        return null;
    }
}

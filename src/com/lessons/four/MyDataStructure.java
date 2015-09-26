package com.lessons.four;

import java.util.Collection;
import java.util.Iterator;

/**
 * Date: 26/09/15
 *
 * @author kbanks
 */
public class MyDataStructure implements Iterable<String> {
    int cursor;
    final String[] data;

    public MyDataStructure() { this(10); }
    public MyDataStructure(int size) {
        cursor = -1;
        data = new String[size];
    }

    public void push(String value) {
        if(cursor >= data.length) {
            throw new IllegalStateException("I am full");
        } else {
            data[++cursor] = value;
        }
    }

    public String pop() {
        if(isEmpty()) {
            throw new IllegalStateException("attempted to go past the end");
        }
        String result = data[cursor];
        data[cursor] = null;
        cursor--;
        return result;

//        String result = data[cursor];
//        cursor--;
//        return result;
    }

    public boolean isEmpty() { return cursor == -1; }

    /** Everything above this is the "data structure implementation, things below here are related to iterators **/

    //From iteratable
    @Override
    public Iterator<String> iterator() {
        return new MyDataStructureIterator(this);
    }
}

package com.lessons.four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Date: 26/09/15
 *
 * @author kbanks
 */
public class KBag<T> implements Iterable<T> {
    private final List<T> storage;

    public KBag() {
        storage = new ArrayList<>();
    }

    public boolean add(T value) {
        return storage.add(value);
    }

    @Override
    public Iterator<T> iterator() {
        //TODO
        return null;
    }
}

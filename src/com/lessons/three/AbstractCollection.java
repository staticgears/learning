package com.lessons.three;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Date: 05/09/15
 *
 * @author keith
 */
public abstract class AbstractCollection<T> implements Collection<T> {

    /**
     * @return the head of the LinkedList, needed to provide asimple implementation of iterator()
     */
    protected abstract LinkedListNode<T> getHead();

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private LinkedListNode<T> cursor = null;
            @Override
            public boolean hasNext() {
                cursor = cursor == null ? getHead() : cursor;
                return cursor != null;
            }

            @Override
            public T next() {
                if(! hasNext()) throw new NoSuchElementException();
                cursor = (cursor == null) ? getHead() : cursor.getNext();
                T value = cursor.getValue();
                return value;
            }
        };
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean result = false;
        for(Object t : c) {
            result &= contains(t);
        }
        return result;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean result = false;
        for(T t : c) {
            result |= add(t);
        }
        return result;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean result = false;
        for(Object o : c) {
            result |= remove(o);
        }
        return result;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("retainAll");
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        int i=0;
        for(Object o : this) {
            array[i++] = o;
        }
        return array;
    }

    @Override
    public <E> E[] toArray(E[] a) {
        int size = size();
        E[] array = a.length >= size ? a :
                (E[])java.lang.reflect.Array
                        .newInstance(a.getClass().getComponentType(), size);
        int i=0;
        for(T o : this) {
            array[i++] = (E) o;
        }
        if(i < array.length) {
            array[i] = null;
        }
        return array;
    }

}

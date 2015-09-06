package com.lessons.three;

import java.util.Collection;

/**
 * Date: 05/09/15
 *
 * @author keith
 */
public class LinkedListKeith<T> extends AbstractCollection<T> implements Collection<T> {
    private LinkedListNode<T> head;
    private int size;

    @Override
    protected LinkedListNode<T> getHead() { return head; }

    @Override
    public boolean add(T value) {
        LinkedListNode<T> toBeInserted = new LinkedListNode<>();
        toBeInserted.setValue(value);

        if(head == null) {
            head = toBeInserted;
        } else {
            LinkedListNode<T> tail = head;
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            toBeInserted.setPrev(tail);
            tail.setNext(toBeInserted);
        }
        size++;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        LinkedListNode<T> cursor = head;
        while(cursor != null) {
            if(cursor.getValue().equals(o)) {
                return true;
            }
            cursor = cursor.getNext();
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        LinkedListNode<T> cursor = head;

        while(cursor != null) {
            if(cursor.getValue().equals(o)) {
                LinkedListNode<T> next = cursor.getNext();
                LinkedListNode<T> prev = cursor.getPrev();

                if(next != null) {
                    next.setPrev(prev);
                }
                if(prev != null) {
                    prev.setNext(next);
                }
                if(cursor == head) {
                    head = cursor.getNext();
                }
                size--;
                return true;
            }
            cursor = cursor.getNext();
        }
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }
}

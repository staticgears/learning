package com.lessons.three;

import java.util.Collection;

/**
 * Date: 05/09/15
 * Implementation of a simplified LinkedList.
 * Concepts to consider, how should information be tracked. Should you imply of a "head" or "tail" or both?
 * @author Parnian
 */
public class LinkedList<T> extends AbstractCollection<T> implements Collection<T> {

    /**
     * I needed this to implementthe iterator() method in the base class
     * @return the head node of hte LinkedList
     */
    @Override
    protected LinkedListNode<T> getHead() {
        return null;
    }

    /**
     * Consider the cases such as an empty list and list which already has elements in it.
     * @see LinkedListKeith#add(Object)
     * @param value to insert into the list
     * @return true if the value was added
     */
    @Override
    public boolean add(T value) {
        return false;
    }

    /**
     * Consider the empty list case.
     * @see LinkedListKeith#contains(Object)
     * @param o - thing to search for
     * @return true if the Object is found within the collection
     */
    @Override
    public boolean contains(Object o) {
        return false;
    }

    /**
     * Remove the Object, consider the cases of an empty list as well as a list of elements.
     * @see LinkedListKeith#remove(Object)
     * @param o - Object to remove
     * @return true if hte Obejct was found and removed
     */
    @Override
    public boolean remove(Object o) {
        return false;
    }

    /**
     * Reset the list back to an empty state.
     * @see LinkedListKeith#clear()
     */
    @Override
    public void clear() {

    }

    /**
     * @see #size()
     * @see LinkedListKeith#isEmpty()
     * @return true if hte list is empty
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * @see #isEmpty()
     * @see LinkedListKeith#size()
     * @return the size of the linked list
     */
    @Override
    public int size() {
        return 0;
    }
}

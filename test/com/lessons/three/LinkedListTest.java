package com.lessons.three;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.junit.Ignore;

/**
 * Date: 05/09/15
 * This is not very important
 * @author keith
 */
public class LinkedListTest {
    private Collection<String> create() {
        boolean useKeithsVersion = true;
        if(useKeithsVersion) {
            return new LinkedListKeith<>();
        } else {
            return new LinkedList<>();
        }
    }


    @Ignore
    @Test
    public void testGetHead() {
        Collection<String> list1 = create();
        assertFalse(list1.iterator().hasNext());
        list1.add("one");

        Iterator<String> iter = list1.iterator();
        assertTrue(iter.hasNext());
        iter.next();
        assertTrue(iter.hasNext());
    }

    @Test
    public void testAddToEmpty() {
        Collection<String> list1 = create();
        list1.add("one");
        assertEquals(1, list1.size());
    }

    @Test
    public void testAddMultiple() {
        Collection<String> list1 = create();
        list1.add("one");
        assertEquals(1, list1.size());
        list1.clear();
        assertTrue(list1.isEmpty());
        list1.add("one");
        assertEquals(1, list1.size());
        list1.add("one");
        assertEquals(2, list1.size());
    }

    @Test
    public void testContainsWhenEmpty() {
        Collection<String> list1 = create();
        assertFalse(list1.contains("not there"));
    }

    @Test
    public void testContainsFound() {
        Collection<String> list1 = create();
        list1.add("one");
        assertTrue(list1.contains("one"));
    }

    @Test
    public void testContainsNotFound() {
        Collection<String> list1 = create();
        list1.add("one");
        assertFalse(list1.contains("not there"));
    }

    @Test
    public void testRemoveFromEmpty() {
        Collection<String> list1 = create();
        assertFalse(list1.remove("not there"));
        assertEquals(0, list1.size());
        assertTrue(list1.isEmpty());
    }

    @Test
    public void testRemove() {
        Collection<String> list1 = create();
        list1.add("one");
        assertFalse(list1.remove("not there"));
        assertTrue(list1.remove("one"));
        assertEquals(0, list1.size());
        assertTrue(list1.isEmpty());
    }

    @Test
    public void testRemoveMultipleTimes() {
        Collection<String> list1 = create();
        list1.add("one");
        assertTrue(list1.remove("one"));
        assertFalse(list1.remove("one"));
        assertEquals(0, list1.size());
        assertTrue(list1.isEmpty());
    }

    @Test
    public void testEmptySizeAndIsEmpty() {
        Collection<String> list1 = create();
        assertEquals(0, list1.size());
        assertTrue(list1.isEmpty());
    }

    @Test
    public void testSize() {
        Collection<String> list1 = create();
        list1.add("one");
        assertEquals(1, list1.size());
        list1.add("three");
        assertEquals(2, list1.size());
        list1.remove("one");
        assertEquals(1, list1.size());
        list1.remove("three");
        assertEquals(0, list1.size());
    }

    @Test
    public void testClearEmptyList() {
        Collection<String> list1 = create();
        list1.clear();
        assertTrue(list1.isEmpty());
    }

    @Test
    public void testClear() {
        Collection<String> list1 = create();
        list1.add("one");
        assertFalse(list1.isEmpty());
        list1.clear();
        assertTrue(list1.isEmpty());
        assertEquals(0, list1.size());
    }

    @Test
    public void testIsEmptyWithAnItem() {
        Collection<String> list1 = create();
        list1.add("This is an element");
        assertFalse(list1.isEmpty());
    }

    @Test
    public void testIsEmptyAfterRemovingAnItem() {
        Collection<String> list1 = create();
        list1.add("This is an element");
        list1.remove("This is an element");
        assertTrue(list1.isEmpty());
    }
}

package com.lessons.four;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Date: 26/09/15
 *
 * @author keith
 */
public class MyDataStructureTest extends TestCase {

    @Test
    public void testIteratorEmpty() throws Exception {
        MyDataStructure mine = new MyDataStructure();
        Iterator<String> iter = mine.iterator();
        assertFalse(iter.hasNext());
    }

    @Test
    public void testIteratorEmptyAfterWork() throws Exception {
        MyDataStructure mine = new MyDataStructure();
        mine.push("");
        mine.pop();
        Iterator<String> iter = mine.iterator();
        assertFalse(iter.hasNext());
    }

    @Test
    public void testIteratorWithNull() throws Exception {
        MyDataStructure mine = new MyDataStructure();
        mine.push(null);
        Iterator<String> iter = mine.iterator();
        assertTrue(iter.hasNext());
        assertEquals(null, iter.next());
    }

    @Test
    public void testIteratorWithSingleItem() throws Exception {
        MyDataStructure mine = new MyDataStructure();
        mine.push("only_one");
        Iterator<String> iter = mine.iterator();
        assertTrue(iter.hasNext());
        assertEquals("only_one", iter.next());
    }

    @Test
    public void testIteratorAndFull() throws Exception {
        MyDataStructure mine = new MyDataStructure(3);
        mine.push("one");
        mine.push("two");
        mine.push("three");
        Iterator<String> iter = mine.iterator();
        assertEquals("three", iter.next());
        assertEquals("two", iter.next());
        assertEquals("one", iter.next());
        assertFalse(iter.hasNext());
    }

    @Test(expected = NoSuchElementException.class )
    public void testIteratorNoSuchElementException() throws Exception {
        MyDataStructure mine = new MyDataStructure();
        Iterator<String> iter = mine.iterator();
        assertFalse(iter.hasNext());
        iter.next();
    }

    @Test(expected = ConcurrentModificationException.class )
    public void testIteratorConcurrentModificationException() throws Exception {
        MyDataStructure mine = new MyDataStructure();
        Iterator<String> iter = mine.iterator();
        mine.push("new value while iteratering");
        iter.next();
    }
}
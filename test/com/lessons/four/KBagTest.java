package com.lessons.four;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Date: 26/09/15
 *
 * @author keith
 */
public class KBagTest extends TestCase {

    @Test
    public void testIteratorEmpty() throws Exception {
        KBag mine = new KBag();
        Iterator<String> iter = mine.iterator();
        assertFalse(iter.hasNext());
    }

    @Test
    public void testIteratorWithNull() throws Exception {
        KBag mine = new KBag();
        mine.add(null);
        Iterator<String> iter = mine.iterator();
        assertTrue(iter.hasNext());
        assertEquals(null, iter.next());
    }

    @Test
    public void testIteratorWithSingleItem() throws Exception {
        KBag mine = new KBag();
        mine.add("only_one");
        Iterator<String> iter = mine.iterator();
        assertTrue(iter.hasNext());
        assertEquals("only_one", iter.next());
    }

    @Test
    public void testIteratorMultiple() throws Exception {
        KBag mine = new KBag();
        mine.add("one");
        mine.add("two");
        mine.add("three");
        Iterator<String> iter = mine.iterator();
        assertEquals("one", iter.next());
        assertEquals("two", iter.next());
        assertEquals("three", iter.next());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testIteratorNoSuchElementException() throws Exception {
        KBag mine = new KBag();
        Iterator<String> iter = mine.iterator();
        assertFalse(iter.hasNext());
        try {
            iter.next();
            fail("did not catch expected exception");
        } catch( NoSuchElementException ex) {
            //pass
        }
    }

//    @Test(expected = ConcurrentModificationException.class )
//    public void testIteratorConcurrentModificationException() throws Exception {
//        KBag mine = new KBag();
//        Iterator<String> iter = mine.iterator();
//        mine.push("new value while iteratering");
//        iter.next();
//    }
}
package com.lessons.one;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Date: 31/08/15
 *
 * @author kbanks
 */
public class ListsAndLoopsTest {
    private static final List<Integer> data1 = Arrays.asList(1, 3, 4, 5, 6, 9);

    @Test
    public void testDoit() {
        ListsAndLoops instance = new ListsAndLoops();
        Integer result = instance.doit(data1);
        assertEquals(new Integer(81), result);
    }

    @Test
    public void testDoit_1() {
        ListsAndLoops instance = new ListsAndLoops();
        Integer result = instance.doit_1(data1);
        assertEquals(new Integer(81), result);
    }
}

package com.lessons.two;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Date: 06/09/15
 *
 * @author keith
 */
public class PrinterTest extends TestCase {

    @Test
    public void testAddStuff() throws Exception {
        Printer print = new Printer();
        print.addStuff();
    }
}
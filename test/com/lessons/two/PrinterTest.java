package com.lessons.two;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 06/09/15
 *
 * @author keith
 */
public class PrinterTest extends TestCase {


    @Test
    public void testAddStuff() {
        Printer print = new Printer();
        print.addStuff();
    }

    @Test
    public void testF() {
        int size = 100;
        for(int n=0; n <= size; n++) {
            System.out.println("result for n: " + n + " is : " + f(n));
        }
    }

    private long f(int x) {
        return f(x, 1,  1);
    }

    private long f(int x, long a, long b) {
        if (x <= 1) return a;
        long t = a;
        a += b;
        b = t;
        return f(x-1, a, b);
    }

    @Test
    public void testF2() {
        int size = 100;
        for(int n=0; n <= size; n++) {
            System.out.println("result for n: " + n + " is : " + f2(n));
        }
    }

    private long f2(int x) {
        if(x < 2) return x;
        if(x == 44) return 701408733;
        return  f(x-1) + f(x-2);
    }

}
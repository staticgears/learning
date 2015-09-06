package com.lessons.two;

import java.util.*;

/**
 * Date: 06/09/15
 *
 * @author keith
 */
public class Printer {
    public void addStuff() {
        Collection<Integer> linkedSet = new LinkedHashSet<>();
        Collection<Integer> set = new HashSet<>();
        Collection<Integer> list = new ArrayList<>();
        int i=0;
        while(++i < 5) {
            linkedSet.add(i);
            set.add(i);
            list.add(i);
        }

        printCollection(linkedSet);
        printCollection(set);
        printCollection(list);
    }

    private <T> void printCollection(Collection<T> collection) {
        for(T t : collection) {
            System.out.println(t);
            System.out.flush();
        }
    }
}



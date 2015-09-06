package com.lessons.two;

import java.util.*;

/**
 * Date: 05/09/15
 *
 * @author keith
 */
public class DataStructures {
    public DataStructures() {}

    public static void main(String[] args) {
        DataStructures instance = new DataStructures();
        //instance.setExample();
        //instance.listExample();
        //instance.contrastExample();
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        instance.collectionExample(set);
        print("------------now as a list ---------------");
        instance.collectionExample(list);
    }

    private void setExample() {
        Set<String> set = new HashSet<>();
        boolean result = set.add("hi");
        boolean resultAfterDuplicateAdd = set.add("hi");
        print("result: " + result + " resultAfterDuplicateAdd: " + resultAfterDuplicateAdd);

        set.add("how");
        set.add("are");
        set.add("you");
        set.add("happy");
        set.add("This has an \"h\", but doesn't start with one");
        Iterator<String> iter = set.iterator();
        while(iter.hasNext() ) {
            String value = iter.next();
            if(value.startsWith("h")) {
                print("found a match: " + value);
            }
        }
    }

    private void listExample() {
        List<String> list = new ArrayList<>();
        boolean result = list.add("hi");
        boolean resultAfterDuplicateAdd = list.add("hi");
        print("result: " + result + " resultAfterDuplicateAdd: " + resultAfterDuplicateAdd);

        list.add("how");
        list.add("are");
        list.add("you");
        list.add("happy");
        list.add("This has an \"h\", but doesn't start with one");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext() ) {
            String value = iter.next();
            if(value.startsWith("h")) {
                print("found a match: " + value);
            }
        }

        for(String value : list) {
            if(value.startsWith("h")) {
                print("found a match: " + value);
            }
        }

        for(int i=0; i< list.size(); i++) {
            String value = list.get(i);
            if(value.startsWith("h")) {
                print("found a match: " + value);
            }
        }

        String value = null;
        for(Iterator<String> iter2 = list.iterator(); iter2.hasNext(); value=iter2.next()) {
            if(value.startsWith("h")) {
                print("found a match: " + value);
            }
        }
    }

    private void collectionExample(Collection<String> collection) {
        boolean result = collection.add("hi");
        boolean resultAfterDuplicateAdd = collection.add("hi");
        print("result: " + result + " resultAfterDuplicateAdd: " + resultAfterDuplicateAdd);

        collection.add("how");
        collection.add("are");
        collection.add("you");
        collection.add("happy");
        collection.add("This has an \"h\", but doesn't start with one");
        Iterator<String> iter = collection.iterator();
        while(iter.hasNext() ) {
            String value = iter.next();
            print(value);
        }
    }

    private boolean contrastExample() {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        boolean a = set.add("hi");
        boolean b = set.add("hi");
        boolean c = list.add("hi");
        boolean d = list.add("hi");
        return a | b |c | d;
    }

    private static void print(String s) { System.out.println(s); System.out.flush();}
}

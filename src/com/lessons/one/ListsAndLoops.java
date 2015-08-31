package com.lessons.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Date: 30/08/15
 *
 */
public class ListsAndLoops {
    private static final List<Integer> data1 = Arrays.asList(1, 3, 4, 5, 6, 9);

    public ListsAndLoops() {
    }

    public static void main(String[] args) {
        ListsAndLoops instance = new ListsAndLoops();
        Integer result = instance.doit(new ArrayList<Integer>(data1));
        System.out.println("The answer is: " + result);
        Integer result2 = instance.doit_1(new ArrayList<Integer>(data1));
        System.out.println("The other answer is: " + result2);
    }

    /*
     *  Take the first number and add it to all the other numbers, when there is only 1 number remaining
     *  then return the answer.
      *  8, 7, 6 , 4
      *  15, 14, 12
      *  29, 27
      *  return 56
     */
    public Integer doit(List<Integer> data) {
      //loop over values, add first number to all others except the first and save them in new array list
        //1, 3, 4, 5, 6, 9
        //4,5,6,7,10
        //9,10,11,14
        //19,20,23
        //39,42
        //return 81

        ArrayList<Integer> array2= new ArrayList<Integer>();
//        int k = data.size()-1;
//        for(int j=0; j<k; j++) {
        while(data.size() > 1) {
            int j =0;
            for (int i = 0; i < data.size()-1; i++) {
                Integer value = data.get(i + 1) + data.get(0);
                array2.add(value);
                System.out.println(String.format("i : %d, j : %d\ndata: %s\narray2:%s\n", i, j, Objects.toString(data), Objects.toString(array2)));
                System.out.flush();
            }
            data = new ArrayList<Integer>(array2);
            array2.clear();

            System.out.println("data size : " + data.size());
            System.out.flush();

        }
        return data.get(0);
    }

    public Integer doit_1(List<Integer> data) {
        if(data == null || data.size() == 0) { return 0; }
        if(data.size() == 1) { return data.get(0); }

        Integer first = data.get(0);
        for(int i=1; i<data.size(); i++) {
            data.set(i, data.get(i)+first);
        }
        return doit_1(data.subList(1, data.size()));
    }
}

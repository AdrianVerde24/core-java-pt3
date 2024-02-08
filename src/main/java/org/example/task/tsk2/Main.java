package org.example.task.tsk2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        Integer[] arr = new Integer[10];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Sort.lstSorter());
    }

}

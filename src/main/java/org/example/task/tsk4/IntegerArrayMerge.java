package org.example.task.tsk4;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;


public class IntegerArrayMerge {
    public static List<Integer> mergeIntegerarrays (){

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);


        List<List<Integer>> namesNested = Arrays.asList(
                list1,
                list2,
                list3);

        return namesNested.stream()
                .flatMap(Collection::stream)
                .toList();



    }}

        
        



package org.example.test.tsk2;
import java.util.ArrayList;
import java.util.HashSet;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.task.tsk2.Sort.lstSorter;


public class SortTest {

    public static Boolean UpperCaseChecker(String str){
        return Character.isUpperCase(str.charAt(0));
    }

    static Boolean arraySortedOrNot(List <String> lst) // Method to check if Array is sorted
    {
        List<String>Arraysort = lst.stream().sorted().toList();
        HashSet<String> TestsortSet = new HashSet<>(Arraysort);
        HashSet<String> OrignalSet = new HashSet<>(lst);
        return TestsortSet.containsAll(OrignalSet);
    }

    public static void main(String[] args) {

        List<String> memberNames = new ArrayList<>();
        memberNames.add("a1");
        memberNames.add("a3");
        memberNames.add("a2");
        //List <String> b = arraySortedOrNot(memberNames);
        boolean b = arraySortedOrNot(memberNames);
        System.out.println(b);

    }

    /*
    @Test

    public void SortChecker() {
        Assertions.assertEquals(true,arraySortedOrNot(lstSorter()));
    }

    */



}

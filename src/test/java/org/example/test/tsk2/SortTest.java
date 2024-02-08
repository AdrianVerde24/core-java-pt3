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

    @Test
    public void SortChecker() {
        String [] testLst = {"C3","C2","C1"};
        Assertions.assertEquals(Arrays.stream(testLst).toList(),lstSorter());
    }





}

package org.example.task.tsk2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

import static java.util.Arrays.stream;

public class Sort {

    public static List<String> lstSorter(){
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1","c3");
        List <String> strm = new ArrayList<>();
        List <String> strm1 = new ArrayList<>();


        strm = myList.stream().filter(n -> n.charAt(0) == 'c').sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        strm.replaceAll(String::toUpperCase);
        //        strm = myList.stream().filter(Sorter::test).collect(Collectors.toList());
        return strm;
    }

}

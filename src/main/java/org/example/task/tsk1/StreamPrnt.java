package org.example.task.tsk1;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class StreamPrnt {

    public static List<Integer> rtnStreamval(){
    Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
    List<Integer> listOfIntegers = stream.collect(Collectors.toList());
    return listOfIntegers;
    }
}

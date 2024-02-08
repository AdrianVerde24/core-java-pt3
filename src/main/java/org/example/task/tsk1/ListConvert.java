package org.example.task.tsk1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListConvert {
    public static List<Integer> streamToListConverter (){
        List <Integer> randomNumberList = null;
        randomNumberList = Stream.generate(new Random()::nextInt)
                .limit(20).toList();
//        List<Integer> evenNumberList = randomNumberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        return evenNumberList;
        return streamToListConverter(randomNumberList);
    }

    public static List<Integer> streamToListConverter (List<Integer> integerList){
        return integerList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
}

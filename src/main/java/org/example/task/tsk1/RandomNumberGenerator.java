package org.example.task.tsk1;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RandomNumberGenerator {

    public static List <Integer> geneRator (){
        List <Integer> randomNumberList = null;
        randomNumberList = Stream.generate(new Random()::nextInt)
                .limit(20).toList();
        return randomNumberList;
    }
}

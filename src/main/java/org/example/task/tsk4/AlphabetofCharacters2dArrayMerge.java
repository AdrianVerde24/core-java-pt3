package org.example.task.tsk4;

import java.util.*;
import java.util.stream.Stream;

public class AlphabetofCharacters2dArrayMerge {
    
    public static List<String> mergeCharacterarrays(){
        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        //System.out.println(Arrays.deepToString(dataArray[0]));

        return Arrays.stream(dataArray).toList()
                .stream()
                .flatMap(Stream::of)
                .toList();
    }
}

package org.example.test.tsk4;

import org.example.task.tsk4.AlphabetofCharacters2dArrayMerge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AlphabetofCharacters2dArrayMergeTest {

    @Test

             public void AofCMChecker(){
        List <String> listofChar = List.of(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        Assertions.assertEquals(listofChar, AlphabetofCharacters2dArrayMerge.mergeCharacterarrays());
    }



}

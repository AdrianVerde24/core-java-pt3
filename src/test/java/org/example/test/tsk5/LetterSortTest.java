package org.example.test.tsk5;
import org.example.task.tsk5.LetterSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class LetterSortTest {
    @Test

    public void AofCMChecker(){
        String [] strarray = {"s","a","z","d"};
        Assertions.assertEquals(Arrays.stream(strarray).toList(), LetterSort.createListofOnlyLetters());
    }
}





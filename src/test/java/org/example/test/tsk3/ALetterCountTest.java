package org.example.test.tsk3;

import org.example.task.tsk3.ALetterCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ALetterCountTest {

@Test
    public void ACountChecker() {
        Assertions.assertEquals(3, ALetterCount.streamCounterForNamesWithA());
    }

}

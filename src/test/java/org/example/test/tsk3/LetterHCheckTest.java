package org.example.test.tsk3;

import org.example.task.tsk3.LetterHCheck;
import org.example.task.tsk3.LocateFirstLName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterHCheckTest {

@Test
    public void letterHcheckerTst() {
        Assertions.assertEquals(true , LetterHCheck.letterHchecker());
    }

}

package org.example.test.tsk3;

import org.example.task.tsk3.LetterSCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterSCheckTest {

@Test
    public void letterScheckerTst() {
        Assertions.assertEquals(false , LetterSCheck.letterSchecker());
    }

}

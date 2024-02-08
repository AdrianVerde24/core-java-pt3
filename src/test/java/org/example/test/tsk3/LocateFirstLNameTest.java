package org.example.test.tsk3;

import org.example.task.tsk3.ALetterCount;
import org.example.task.tsk3.LocateFirstLName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocateFirstLNameTest {

@Test
    public void ACountChecker() {
        Assertions.assertEquals("Optional[Lokesh]", LocateFirstLName.findFirstNameWithL());
    }}



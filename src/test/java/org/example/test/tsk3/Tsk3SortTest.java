package org.example.test.tsk3;

import org.example.task.tsk3.Tsk3Sort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Tsk3SortTest {

@Test
    public void Tsk3SortChecker() {
    List <String> AListNames = new ArrayList<>();
    AListNames.add("amitabh");
    AListNames.add("abibaba");
    Assertions.assertEquals(AListNames, Tsk3Sort.nameSorter());
    }

}


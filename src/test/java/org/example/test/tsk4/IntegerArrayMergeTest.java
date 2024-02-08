package org.example.test.tsk4;

import org.example.task.tsk4.AlphabetofCharacters2dArrayMerge;
import org.example.task.tsk4.IntegerArrayMerge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class IntegerArrayMergeTest {

    @Test

    public void AofCMChecker(){
        Integer [] intarray = {1,2,3,4,5,6,7,8,9};
        Assertions.assertEquals(Arrays.stream(intarray).toList(), IntegerArrayMerge.mergeIntegerarrays());
    }}

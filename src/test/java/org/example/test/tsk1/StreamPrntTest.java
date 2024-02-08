package org.example.test.tsk1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.task.tsk1.StreamPrnt.rtnStreamval;

class StreamPrntTest {

    @Test
    public void comparePrnt() {
        Assertions.assertEquals(rtnStreamval(), List.of(1,2,3,4,5,6,7,8,9));
    }



}
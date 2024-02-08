package org.example.test.tsk1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.task.tsk1.RandomNumberGenerator.geneRator;


class RandomNumberGeneratorTest {

    @Test
    public void listnumberChecker() {
        Assertions.assertEquals(geneRator().size(),20);
    }

}
package org.example.test.tsk1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.example.task.tsk1.ListConvert.streamToListConverter;

class ListConvertTest {
    @Test


    public void listnumberChecker() {
        Assertions.assertTrue(streamToListConverter().stream().allMatch(val -> val % 2 == 0));
        List.of(1,2,4,6,8).stream().allMatch(val -> val % 2 == 0);
    }

}
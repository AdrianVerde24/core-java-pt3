package org.example.task.tsk3;
import java.util.ArrayList;
import java.util.List;

public class ALetterCount {
    public static long streamCounterForNamesWithA(){
        List<String> memberNames = new ArrayList<>();

        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        return memberNames.stream().filter(n->n.charAt(0)=='A').count();
    }
}

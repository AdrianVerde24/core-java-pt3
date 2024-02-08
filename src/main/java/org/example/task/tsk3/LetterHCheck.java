package org.example.task.tsk3;

import java.util.ArrayList;
import java.util.List;

public class LetterHCheck {
    public static Boolean letterHchecker(){

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


        //      listCheck = true;
        return memberNames.stream().noneMatch(n -> n.contains("H"));

        
    }
}

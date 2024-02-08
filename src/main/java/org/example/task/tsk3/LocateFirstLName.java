package org.example.task.tsk3;

import java.util.ArrayList;
import java.util.List;

public class LocateFirstLName {
    public static String findFirstNameWithL(){

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

        return String.valueOf(memberNames.stream().filter(n->n.charAt(0)=='L').findFirst());


        //return "TEST";
    }
}

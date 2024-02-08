package org.example.task.tsk3;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Tsk3Sort {
    public static List<String> nameSorter(){
        List<String> memberNames = new ArrayList<>();
        List<String> sortedMemberNames = new ArrayList<>();

        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        sortedMemberNames = memberNames.stream().filter(n->n.charAt(0)=='A'&& n.length()>5).collect(Collectors.toList());
        sortedMemberNames.replaceAll(String::toLowerCase);
        return sortedMemberNames;
    }
}

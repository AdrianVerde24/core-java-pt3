package org.example.task.tsk5;
import java.util.*;
import java.util.regex.Pattern;
public class LetterSort {

    public static List<String> createListofOnlyLetters(){

        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        List <String> listOfLetters;

        List<List<String>> Mapkeys = Arrays.asList(
                people.get("John"),
                people.get("Mary"),
                people.get("Steve"));

        listOfLetters = Mapkeys.stream()
                .flatMap(Collection::stream)
                .toList();
        return listOfLetters.stream().filter(n-> Pattern.matches("[a-z]",n)).toList();
    }
}

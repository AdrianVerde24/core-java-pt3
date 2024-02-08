package org.example.task.tsk5;

public class Main {

    public static void main(String[] args) {

        /*

        Task 5:

 Write to a new list only letters that occur in the values of this map
Map<String, List<String>> people = new HashMap<>();
   people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
   people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
   people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));
         */
        System.out.println(LetterSort.createListofOnlyLetters());
    }
}

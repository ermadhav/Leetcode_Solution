import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // Create a list of pairs where each pair contains a name and its corresponding height
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            people.add(new Person(names[i], heights[i]));
        }

        // Sort the list in descending order of heights
        Collections.sort(people, (a, b) -> b.height - a.height);

        // Extract the names from the sorted list
        String[] sortedNames = new String[names.length];
        for (int i = 0; i < people.size(); i++) {
            sortedNames[i] = people.get(i).name;
        }

        return sortedNames;
    }
    // Helper class to represent a person with a name and height
    private static class Person {
        String name;
        int height;
        Person(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}

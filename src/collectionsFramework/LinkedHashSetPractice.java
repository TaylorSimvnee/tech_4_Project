package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
//Use if I want to get unique, no duplicates...I don't care about the index, and I want to get the order of how I add them to this list
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("BAR");
        words.add(null);
        words.add("John");
        words.add("John");

        System.out.println(words);
    }
}

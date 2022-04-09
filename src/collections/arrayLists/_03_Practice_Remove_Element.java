package collections.arrayLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _03_Practice_Remove_Element {
    public static void main(String[] args) {

        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        //[Java, JavaScript, C#, Python, C++]

        /*
        Remove Python from the list and print it

        [Java, JavaScript, C#, C++]

         */

        System.out.println("Task 1");
        languages.remove("Python");
        System.out.println(languages);


        System.out.println("Task 2");
            /*
            TASK-2
            Remove all elements that start with J

            RESULT:
            [C#, C++]
             */
//
//        List<String> startsJ = new LinkedList<>();
//        for (String language : languages) {             // DO NOT REMOVE ELEMENTS WITH FOR I OR FOR EACH bc you WILL get an exception. while the
//            if(language.startsWith("J")) startsJ.add(language); //loop is running the size changes. so use a new List to add the elements you want to remove
//        }                                                              //then you can .remove all new List from old List
//        languages.removeAll(startsJ);
//        System.out.println(languages);

        //ORRRRR

        languages.removeIf(element -> element.startsWith("J"));
        System.out.println(languages);



        //USING ITERATOR

        Iterator<String> iterator = languages.iterator(); // I put all elements in a queue

        while(iterator.hasNext()){ // We are asking if there is an element in the queue
            String element = iterator.next(); // this gets an element from the queue
            if(element.startsWith("J")) { // if element came from the queue starts with J
                iterator.remove(); // Remove
            }
        }

        System.out.println(languages);





    }
}

package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {

        /*
        TASK-1
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
         */

        System.out.println("------Task-1-------");
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};

        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("Sorted array = " + Arrays.toString(students));

        System.out.println("------Task-2-------");

                /*
        TASK-2
        Print the first and the last names after it is sorted

        EXPECTED:
        First name is = Adam
        Last name is = Tom
         */
        System.out.println("First name is = " + students[0]);
        System.out.println("First name is = " + students[students.length-1]);

        System.out.println("------Task-3 - for each/ enhanced for-------");
        int count = 0;
        for (String namesWithA : students){
            if(namesWithA.startsWith("A")) count++;
        }
        System.out.println(count);
        System.out.println("------Task-3 - for i loop-------");

        int counter = 0;
        for (int i = 0; i < students.length; i++){
            if(students[i].startsWith("A")) counter++;
        }
        System.out.println(counter);

        System.out.println("------Task-4-------");

        int counter2 = 0;

        for (String namesWith : students){
            // if(namesWith.contains("A") || namesWith.contains("a")) counter2++;
            // else if(namesWith.contains("E") || namesWith.contains("e")) counter2++; orrrr
            String s = namesWith.toLowerCase();
             if(namesWith.contains("a") || namesWith.contains("e")) counter2++;
        }
        System.out.println(counter2);

        System.out.println("------Task-5-------");

        int counter3 = 0;
        for (String namesWith : students) {
            if(namesWith.length() >= 5) counter3++;
        }
        System.out.println(counter3);

        int counter4 = 0;
        for (int i = 0; i < students.length; i++){
            if(students[i].length() >=5) counter4++;
        }
        System.out.println(counter4);

        System.out.println("------Task-5-------");
        /*
        TASK-6
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Check if this array has an element that is equal to "Jennifer"
        if it has it, print true
        Otherwise, print false

        EXPECTED:
        false
         */

        boolean b = false;
        for (String namesWithA : students){
            if (namesWithA.equals("Jennifer")) {
                b = true;
                break; // BC after the name is found the loop should be stopped. do we have or not. if yes break immediately
            }
        }
        System.out.println(b);


        /*
        Count how many names starts with J or j
        Count how many names starts or ends with S - s
        Count names with 0 - o
        count names that have even lengths
        count names that have odd lengths
        count names that starts with a vowel letter

         */






    }
}

package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {


        String[] objects ={"Remote", "Mouse", "Mouse", "Keyboard", "ipad"};

        /*
        TASK-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise

        expected : true
         */

        System.out.println("Task 1");

        boolean contains = false;
        for(String object : objects){
            if(object.equals("Mouse")){
                contains = true;
                break;
            }
        }
        System.out.println(contains);

        System.out.println("Me playing around");
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.binarySearch(objects, "Mouse"));

        /*
        TASK-1
        Check the collection you have above and print true if one of the element is  board
        Print false otherwise

        expected : true
         */

        System.out.println("Task 3");

        boolean contains1 = false;
        for(String object : objects){
            if(object.equals("board")){
                contains1 = true;
                break;
            }
        }
        System.out.println(contains1);
        Arrays.sort(objects); // My array is sorted "Keyboard", "Mouse","Mouse", "Remote", "iPad"
        //                       0         1       2        3       4

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Key") >= 0); // false


        /*
        TASK-4
        Create an int array to store below data
        {5, -2, 0, -7, 0, 5, 8, 45, 53}

        Check if collection has 5
        Check if collection has 0
        Check if collection has 45
        Check if collection has 3

        RESULT:
        true
        true
        true
        false
         */

        System.out.println("Task 4");

        int[] numbers = {5, -2, 0, -7, 0, 5, 8, 45, 53};
        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers, 5) >= 0); //true
        System.out.println(Arrays.binarySearch(numbers, 0) >= 0); //true
        System.out.println(Arrays.binarySearch(numbers, 45) >= 0); //true
        System.out.println(Arrays.binarySearch(numbers, 3) >= 0); //false



    }
}

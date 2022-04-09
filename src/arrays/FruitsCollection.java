package arrays;

import java.util.Arrays;

public class FruitsCollection {
    public static void main(String[] args) {

        /*
        Create an array that will store 4 fruit names
        Then print empty array
         */

       String[] fruit = new String [4]; // String array named fruit equals new string array of 4
        System.out.println(Arrays.toString(fruit));

        /*
        STore your fav fruit in the index of 0
        store the 4th fav fruit in the index of 3
        other two should be null
        print
         */

        fruit[0] = "Mango";
        fruit[3] = "Banana";
        System.out.println(Arrays.toString(fruit));

        /*
        Find the size of your array and print it
        how many elements in the array
         */

        System.out.println(fruit.length); // 4

        /*
        Print the elements at the index of 0 and 3
         */

        System.out.println(fruit[0] + "\n" + fruit[3]); //Mango
                                                        //Banana

        //What if we try to get a value that is null
        System.out.println(fruit[1]); //null


        System.out.println(fruit[0].toUpperCase()); //MANGO --> each element is known as a string so you can call String methods
        System.out.println(fruit[0].charAt(0)); //M
        System.out.println(fruit[0].length()); // 5

    }
}

package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        // Once students information
        String name;

        name = "John";

        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is  = " + age);

        /*
        The new trend is to have multiple students information
         */

        String studentsName = "Alex, Abe, Yakeen";

        String [] names = {"Alex" ,  "Abe" , "Yakeen"};
        int [] ages = {20, 21, 22};
        char[] favCharacters = { 'A', '%', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        //HOW TO PRINT ARRAY
        System.out.println(names); // [Ljava.lang.String;@1540e19d

        String namesToString = Arrays.toString(names); //Array.toString (Static, because it's called with class Array) returns a string, so we stored in a String
        System.out.println(namesToString); //[Alex, abe, Yakeen]


        // HOW TO GET 1 INDEX FROM ARRAY
        System.out.println(names[1]); //Abe
        System.out.println(names[0]); //Alex
//        System.out.println(names[5]); //ArrayIndexOutOfBoundsException

        // HOW TO UPDATE AN ELEMENT - change Abe to Abraham
        names[1] = "Abraham";

        //ALEX'S age is 20 and his favorite char is A. his balance is 5.6 and  he likes Java is false.
//        System.out.println(names[0] + " 's age is " + ages[0] + " and his fav char is " + favCharacters[0] + ".");
//        System.out.println(names[1] + " 's age is " + ages[1] + " and his fav char is " + favCharacters[1] + ".");
//        System.out.println(names[2] + " 's age is " + ages[2] + " and his fav char is " + favCharacters[2] + ".");
        // HOW TO LOOP ARRAY USING FOR-I LOOP
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + " 's age is " + ages[i] + " and his fav char is " + favCharacters[i] + ".");
        }





    }
}

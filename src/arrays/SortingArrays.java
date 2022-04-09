package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        /*
        HOW TO SORT AN ARRAY OF NUMBERS
        BYTE, SHORT, INT, LONG, FLOAT, DOUBLE

        We will sort these in ascending order
         */
        System.out.println("------Sorting numbers------");
        int[] numbers = { 10, -5, 0, 0, 3, 0, 7, 9};

        System.out.println("My array is = " + Arrays.toString(numbers));

        //Sort this Array in ascending order [-5 0 0 0 3 7 9 10]

        Arrays.sort(numbers); // this method is void. it doesn't return anything


        System.out.println("sorted = " + Arrays.toString(numbers));

      //  System.out.println("My characters array sorted = " + Arrays.toString(characters)); // [A, H, b, z]



        System.out.println("\n--------Sorting words--------\n");
        String[] names = {"Adam", "Adame", "Alex", "tom", "ally", "Adele", "terry", "Josh"};

        System.out.println("My names array = " + Arrays.toString(names));

        Arrays.sort(names);

        //Lexicographically
        System.out.println("My names array sorted = " + Arrays.toString(names)); // Adam, Adame, Adele, Alex, Josh, ally, terry, tom





    }
}

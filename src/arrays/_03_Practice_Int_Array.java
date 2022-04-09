package arrays;

import java.util.Arrays;

public class _03_Practice_Int_Array {
    public static void main(String[] args){

         /*
        TASK-1
        Create an int array and store below data

        -3
        -7
        0
        2
        0
        7
        7
        10
        2
        15

        Print the array with message "Array not sorted = "
        Print the sorted array with message "Array sorted = "
         */

        System.out.println("-----Task-1-------");
        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};

        System.out.println("Array not sorted = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers));

          /*
        TASK-2
        Count how many positive-negative and zero numbers you have

        EXPECTED:
        Positives = 6
        Negatives = 2
        Zeros = 2
         */

        System.out.println("-----Task-2-------");
        int pos = 0, neg = 0, zero = 0;
        for (int num : numbers){
            if (num == 0) zero++;
            else if (num > 0 ) pos++;
            else neg++;
        }
        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + zero);

        System.out.println("-----Task-2- another approach-------");
        int posi = 0, negi = 0;

        for (int number : numbers) {
            if(number > 0) posi++;
            else if(number < 0) negi++;
        }

        System.out.println("Positives = " + posi);
        System.out.println("Negatives = " + negi);
        System.out.println("Zeros = " + (numbers.length - posi - negi));


        System.out.println("-----Task-3-------");

        /*
        TASK-3
        Count how many even and odds

        EXPECTED:
        Evens = 5
        Odds = 5
        */

        int count = 0;
        int count2 = 0;
        for (int num : numbers){
            if(num % 2 == 0) count++;
            else count2++;
        }
        System.out.println("Evens = " + count);
        System.out.println("Odds = " + count2);

        /*
        Extra practice
        Numbers that are more than 7 ---> 2
        Numbers that can be divided by 5 -> 4
        Numbers that can be divided by 2 but not by 3 --> 3
        Check if it contains 10 --> true
        Check if it contains 8 --> false

        Please do this Count how many numbers are 2 digits
         */











    }
}

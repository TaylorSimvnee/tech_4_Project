package arrays;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args){

        /*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H
        Print the array
        */
        System.out.println("******Task-1*******");
        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));

        System.out.println("******Task-2*******");
        /*
        TASK-2
        Print the size of the array with a message

        EXPECTED:
        The size of the array is = 6
        */

        System.out.println("The size of the array is = " + chars.length);

        System.out.println("******Task-3*******");

/*
TASK-3
Print each element using fori loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
        */

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


        System.out.println("******Task-4*******");
               /*
TASK-4
Print each element using for each loop

EXPECTED:
#
$
5
A
b
H
*/

        for (char chars_: chars) { // " for each char 'variable name chars_' in chars
            System.out.println(chars_);
        }

        System.out.println("******Task-5*******");
        /*
        TASK-5
        Print each element that are letters

        EXPECTED:
        A
        b
        H
        */

        for (char chars_: chars) {
            if (Character.isLetter(chars_))
            System.out.println(chars_);
        }

        System.out.println("******Task-6 - fori loop*******");
        /*
        TASK-6
        Count how many uppercase characters you have in the array

        EXPECTED:
        2
         */

        int countUpper = 0;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])) countUpper ++;
        }
        System.out.println(countUpper);

        System.out.println("******Task-6 - for each loop*******");
        int counter2 =0;
        for (char character : chars){
            if (Character.isUpperCase(character)) counter2++;
        }
        System.out.println(counter2);

        /*
        extra practice
        count digits
        count spaces
        count lowercase letters
        count specials
         */





    }
}

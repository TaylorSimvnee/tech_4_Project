package arrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {


        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};
        System.out.println(chars.length); //7


        /*
        Print each element with a message

        EXPECTED OUTPUT:
        Element 1 = A
        Element 2 =
        Element 3 = ,
        Element 4 = #
        Element 5 = T
        Element 6 = 6
        Element 7 = 9
        */

        System.out.println("*******for i loop*******");
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
            System.out.println("Element " + count + " = " + chars[i]);
        }

        System.out.println("*******for each loop*******");
        int count2 = 0;
        for (char element : chars) {
            count2++;
            System.out.println("Element " + count2 + " = " + element);
        }








    }
}

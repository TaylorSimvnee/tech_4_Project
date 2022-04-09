package ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOfTwoNumbers {
    public static void main(String[] args) {


        /*
        Write a program that asks user to enter 2 numbers
        Find the smallest and print it

        EXAMPLE PROGRAM:
        Program: Please enter 2 numbers
        User: 5 7

        Program: 5

        */

        // 1st way --> using Math.min() Method


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //2nd way --> using simple if else
        if (num1<num2) System.out.println(num1); // if your 'if' 'else' statement is 1 line, you don't have to use block '{}'
        else System.out.println(num2);

        System.out.println("End of program!");

        //3rd way --> using ternary operator
        /*
            NOTE : It can only be used for simple if-else statements.
            cannot use for if - else if - else and nested if else statements

            dataType variableName = condition ? option1 : option2;
                                   asking condition ? 'if' : else;
                                   true result should always be option1, the first option.
                                   false should come second
         */

          // you don't need to store since you are only using it one time

        System.out.println(num1 < num2 ? num1 : num2);
        System.out.println("End of program!");


    }
}

package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {


/*
Write a Java program that asks user to enter their age
And print "It is your time to get retired!" if their age is more than or equal to 55
NOTE: Write PSEUDO CODE first

EXAMPLE PROGRAM 1
Program: Please enter your age?
User: 60

Program: It is your time to get retired!

EXAMPLE PROGRAM 1
Program: Please enter your age?
User: 45

Program:

 */
        /*
        1.Create Scanner object
        2.Ask questions about age
        3.retrieve age
        4.use if statement and proper action in curly braces
         */
        Scanner i = new Scanner(System.in);

        System.out.println("Please enter your age");
        //int age = i.nextInt();
        //boolean isAgeMoreThanOrEqualTo = age >= 55... you could put isAgeMoreThanOrEqualTo in the 'if()'
        // don't store if you're not using more than once
        if(i.nextInt() >= 55){
            System.out.println("It is your time to retire");
        } else{
            System.out.println("You will not retire");
        }



    }
}

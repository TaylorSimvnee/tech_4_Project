package homeworks;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("       -Task-1-");

        String s = "";
        for(int i = 1; i <101; i++){
            if(i % 7 == 0) {
                s += i + " - ";
            }}
        System.out.print(s.substring(0,s.length()-3));

        System.out.println("\n\n       -Task-2-");

        String s2 = "";
        for(int i = 1; i <= 50; i++){
            if(i % 6 == 0){
                s2 += i + " - ";
            }
        }
        System.out.print(s2.substring(0,s2.length()-3));

          System.out.println("\n\n       -Task-3-");

          String s3 = "";
          for (int i = 100; i >49; i--){
              if(i % 5 == 0){
                  s3 += i + " - ";
              }
          }
        System.out.println(s3.substring(0,s3.length()-3));

        System.out.println("\n\n       -Task-4-");

        for (int i = 0; i <=7; i++){
            System.out.println("The square of " + i + " is = " + i * i);
        }
        System.out.println("\n\n       -Task-5-");
        int count = 0;
        for (int i = 1; i < 11; i++){
          count +=i;
        }
        System.out.println(count);

        System.out.println("\n\n       -Task-6-");
        System.out.println("Please enter a positive number");
        int num1 = scan.nextInt();
        int multiplier = 1;
         int factorial = 1;
          while(multiplier <= num1 ){
              factorial *= multiplier++;
          }
        System.out.println(factorial);

        System.out.println("\n\n       -Task-7-");
        /*
        *****MINE******
        1.Get and store first and last name from user
        2. create counter container outside the loop, starting from 0
        3.create loop that will tally each vowel present from 0, length-1 index
        4. store total tally in counter
        5.print total vowels

        ***SALIH PSEUDO CODE*****
        1. Create a scanner object for getting the FULL NAME
        2. Create a counter outside the loop
        3. Create a for Loop check EVERY single char if they are vowel count it
        4. Print out "There are 3 vowel letters in this full name"
         */
       String name = ScannerHelper.getANameFromUser();
       int counter = 0;
       for (int i = 0; i <= name.length()-1; i++){
           if(CharacterHelper.isVowel(name.charAt(i))){
               counter++;
           }
       }
        System.out.println("There are " + counter + " vowel letters in this full name");


        System.out.println("\n\n       -Task-8-");
        /*
        ********MINE***********
        1.Get and store  'number' from user
        2.if 'number' >= 100 print message
        2. create loop that (if) number is less than 100, ask for another number and find the sum of those numbers + 'number'
        3.once numbers = 100 break;
        4. print message

        *****SALIH ********
        1. Create a do while Loop
        2. Get number from user with scanner add them to sum
        - and if they are more than or equal to 100 "Sum of the entered numbers is at least 100"
        3. If the number is more than or equal to 100 AND we are at the FIRST run BREAK --> most specific condition should be checked first
             - and print out "This number is already more than 100"
        4. Create a container for counter, sum and number
         */

        int num = 0; // for getting a number from user
        int sum = 0; // for getting the SUM of given NUMBERS
        int attempt = 1; // for checking how many TIMES this Loop has run
        do {
            System.out.println("Please enter a number");
            num = scan.nextInt();
            if (attempt == 1 && num >=100){
                System.out.println("This number is already more than 100")
                ;break;
            }else{
                sum += num;
                if (sum >= 100){
                    System.out.println("Sum of the entered numbers is at least 100");
                }
            }

            attempt++; // this updates how many TIMES we ran the loop and will prevent program from entering the do{ if()}

        }while(sum < 100);



        System.out.println("\n\n       -Task-9-");

        /*
        0 1 -> 1
        1 1 -> 2
        1 2 -> 3
        2 3 -> 5
        a = 0
        b = 1
        a + b = c
        a = b
        b = c

        /*
        1. two containers for 0, 1 and another one for the sum, String for message
        2. Create a fori loop runs 'n' times
        3. print out the series
         */

        int n1 = 0;
        int n2 = 1;
        int total = 0;
        String message = "";

        /*
                n1  n2  total
         i = 0| 0   1   1
         i = 1| 1   1   2
         i = 2| 1   2   3
         i = 3| 2   3   5
         ...
         ..
         0 – 1 – 1 – 2 – 3 – 5 - 8
         */

        for (int i = 0; i < 7; i++) {
            message += n1 + " - ";
            total = n1 + n2;

            n1 = n2;
            n2 = total;
        }

        System.out.println(message.substring(0, message.length() - 3));

        System.out.println("\n\n      -Task-10-");

        String name2;
       do{name2 = ScannerHelper.getANameFromUser();}
       while(!name2.toLowerCase().startsWith("j"));
        System.out.println("End of program");

        }
    }
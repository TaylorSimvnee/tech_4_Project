package loops.controlStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        /*
Write a Java program that ask user to enter 2 diff
integers
Print all the numbers between given 2 integers starting from
biggest to smallest (given numbers are included)
HOWEVER, do not print any number less than 10

5 9 -> 9 8 7 6 5

8 4 -> 8 7 6 5 4
 */

        /*
        1.ask user for 2 numbers
        2. find greatest and smallest numbers
        3. create for loop that will print numbers descending in one line
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scan.nextInt();

        System.out.println("Please enter a number");
        int num2 = scan.nextInt();

        for (int i = Math.max(num1,num2); i>= Math.min(num1,num2); i--){
           if (i < 10) break;
            System.out.print(i + " ");

        }



    }
}

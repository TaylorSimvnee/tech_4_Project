package ifElseStatements.switchStatements;

import java.util.Scanner;

public class WorkCode {
    public static void main(String[] args) {


        /*
        Write a program that ask user to enter which day it is (1 to 5)
        Based on the answer print what color will be selected

        1 Monday -> Blue
        2 Tuesday -> Red
        3 Wednesday -> Purple
        4 Thursday -> Yellow
        5 Friday -> Orange
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Which day is it? (1-5)");
        int day = scan.nextInt();

        // 1st way--> using if- else- if else- if else  statements
        if(day == 1){
            System.out.println("Blue");
        }else if( day == 2){
            System.out.println("red");
        }else if( day == 3){
            System.out.println("purple");
        }else if(day == 4){
            System.out.println("yellow");
        }else if(day == 5){
            System.out.println("orange");
        }

        // 2nd way--> switch cases
        // switch case use for small amount of known cases. 10, 15, 20. if you have 50, you would use if else statements.

        switch(day){
            case 1:
            System.out.println("blue");
            break;
            case 2:
                System.out.println("red");
                break;
            case 3:
                System.out.println("purple");
                break;
            case 4:
                System.out.println("yellow");
                break;
            case 5:
                System.out.println("orange");
                break;
            default:
                System.out.println("Sorry. This is not an acceptable number");

                

        System.out.println("End of program");

        }







    }
}

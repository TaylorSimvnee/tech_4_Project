package exceptions.custom_exceptions;

import java.util.Scanner;

public class Permission {

    public static void checkAge(int age){
        if(age >=16) System.out.println("It is allowed to have a driver licence");
       else throw new RuntimeException("Age of " + age + " is not allowed to have driver licence");
    }

    /*
Create a method that takes an int as an argument to state the day in the week
1 - Sunday
2 - Monday
7 - Saturday
method name = checkIn()
if it is weekday user is allowed to check in from 10 AM to 5 PM
if it is weekend user is allowed to check in 10 AM to 3 PM
if the input is not in the range of 1-7, then throw an exception with message
"The input does not represent any day!!!"
 */
    public static void checkIn(int day){
        if(day ==1 || day == 7) System.out.println("10 AM to 3 PM");
        else if (day > 1 && day < 7 ) System.out.println("check in from 10 AM to 5 PM");
        throw new RuntimeException("The input does not represent any day!!!");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user! Please enter your age?");
        int age = scan.nextInt();

        try{
            checkAge(age);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Your age is = " + age);
        }

        System.out.println("End of the program");
    }
}

package homeworks;

import java.util.Scanner;

public class Homework02_2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String first = scan.nextLine();
        System.out.println("Please enter your last name");
        String last = scan.nextLine();
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter your email address");
        String email = scan.nextLine();
        System.out.println("Please enter your phone number");
        String phone = scan.nextLine();
        System.out.println("Please enter your address");
        String address = scan.nextLine();




        System.out.println("Name your fav book");
        String book = scan.nextLine();
        System.out.println("Name your fav color");
        String color = scan.nextLine();
        System.out.println("Name your fav number");
        int number = scan.nextInt();

        System.out.println(book +"\n"+ color+"\n"+ number);


    }
}

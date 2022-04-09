package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = scan.nextInt();
        return number;
    }
    public static String getANameFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any name");
        String name = scan.nextLine();
        return name;
    }
    public static String getAStringFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String string = scan.nextLine();
        return string;
    }
    public static String getFavBookName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you fav book");
        String book = scan.nextLine();
        return book;
    }
    public static String getQuote(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a your fav quote");
        String quote = scan.nextLine();
        return quote;
    }
    public static String getASentenceFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();
        return sentence;
    }
    public static String getAddressFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full address");
        String address = scan.nextLine();
        return address;
    }
    public static String getACountryFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a country of your choice");
        String country = scan.nextLine();
        return country;
    }
}

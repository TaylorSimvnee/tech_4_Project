package homeworks;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {
//        /*
//        Requirement:
//        Assume that you are given a String as below;
//        String str = ”SDLC is step by step procedure to create an application”;
//        Write a program to find length of given String and the indexes of “SDLC” and “application” words
//         */
//
//        String str = "SDLC is step by step procedure to create an application";
//        System.out.println("The length of the string is = " + str.length()); // 55
//        System.out.println("THe index of 'SDLC" + str.indexOf("SDLC")); //0
//        System.out.println("The index of 'application is = " + str.indexOf("application")); // 44
       /*
       Requirement:
        Assume that you are given a String as below;
        String str = “  I know how to code with Python  ”;

        Write a program to manipulate given String and convert it to be:
        “I KNOW HOW TO CODE WITH JAVA”
        */
//
//        String str2 = "  I know how to code with Python " ;
//        System.out.println(str2.trim().toUpperCase().substring(0,24)+"JAVA");
        /*
        Requirement:
        Assume that you are given a String as below;
        String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
        1.Find the first character of given String which is not white space
        2.Find the last character of given String which is not white space
         */
//
//        String str = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();
//        System.out.println("The first character = " +  str.trim().charAt(0));
//        System.out.println("The second character = " +  str.charAt(str.length()-1));

        /*

        Requirement:
        Assume you are given 3 Strings as below;
        String s1 = “  TECH ”;
        String s2 = “ glo  ”;
        String s3 = “ BAL       “;
        Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!
//         */
//        String s1 = "  TECH ";
//        String s2 = " glo  ";
//        String s3 = " BAL       ";
//
//        String s4 = s1.trim().toLowerCase().replace('t','T') + s2.trim().toLowerCase().replace('g' ,'G') + s3.trim().toLowerCase();
//        System.out.println(s4);
        /*
        Requirement:
        Write a program that asks user to enter their favorite color.
        Then, print the first and last characters of the color
A       lso, print the first and last 3 characters of the color
         Test data:
green
Expected output:
1st character is = g
2nd character is = n
First 3 characters are = gre
Last 3 characters are = een
         */

//        String color = ScannerHelper.getAStringFromUser();
//        System.out.println("First character is = " + color.charAt(0));
//        System.out.println("Last character is = " + color.charAt(color.length()-1));
//        System.out.println("First 3 characters are = " + color.substring(0,3));
//        System.out.println("Last 3 characters are = " + color.substring(color.length()-3));

       /* Requirement:
        Write a program that asks user to enter a full sentence
        Then, convert all sentence to lower case and print the first and last words in the given sentence
        Test data:
        JavA is an object-oriented programming LanguAGE
        Expected output:
        1st word is = java
        2nd word is = language
        */
//        String sentence = ScannerHelper.getASentenceFromUser().toLowerCase();
//
//        System.out.println("1st word is = " + sentence.substring(0,sentence.indexOf(' ')));
//        System.out.println("Last word is = " + sentence.substring(sentence.lastIndexOf(' ')+1));

//        Write a program that asks user to enter a full sentence
//        Then, check if given sentence contains $ character
//        If it contains $ character, then find the index of the $ character and print a proper message for the found index
//        Test data 1:
//        I saved $100 to buy new airpods
//        Expected output 1:
//        This sentence contains $ character
//        $ character’s index is = 8
//        Test data 2:
//        I’ll become a Software Engineer in Test
//        Expected output 2:
//        This sentence does not contain $ character

           String sentence = ScannerHelper.getASentenceFromUser();
           if(sentence.contains("$")) System.out.println("This sentence contains $ character\n$ character index is " + sentence.indexOf('$'));
           else System.out.println("This sentence does not contain a $ character");





    }
}

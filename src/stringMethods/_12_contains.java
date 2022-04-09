package stringMethods;

import utilities.ScannerHelper;

public class _12_contains {
    public static void main(String[] args) {
        /*
        Method task: it is used to find out if a String contains another string or character
        -It is non-static, and we can call it with an object
        -It is a return type, and it returns a boolean
        -It takes a String argument
         */

        String s = "Good Morning!";

        System.out.println(s.contains("Good"));// true
        System.out.println(s.contains(""));// true
        System.out.println(s.contains("123"));//false
        System.out.println(s.contains(s));//true
        System.out.println(s.contains("4iuh")); // false

        /*
            Ask user to enter an address
        If address contains "chicago" in any way, then print "You are in the club"
        else, print "You are not in the club"

        Chicago, CHICAGO, cHIcaGO
        */

        String address = ScannerHelper.getAStringFromUser();
        System.out.println(address.toUpperCase().contains("CHICAGO") ? "You are in the club" :"You are not in the club");
    }
}

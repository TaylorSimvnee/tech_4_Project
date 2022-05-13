package homeworks;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class HomeworkR4 {

    /**
        Requirement:
        -Create a method called noSpace()
        -This method will take one String argument and it will return a new String with all spaces removed from the original String

     */

    public static String noSpace(String str){
        return str.replaceAll("\\s+", "");
    }

    /**
        Requirement:
        -Create a method called replaceFirstLast()
        -This method will take one String argument and it will return a new String with first and last characters replaced

        NOTE: if the length is less than 2, then return empty String
        NOTE: Ignore all before and after spaces (get actual String only)
     */

    public static String replaceFirstLast(String str){
        String s = str.trim();
        int endIndex = s.length()-1;
        if (s.length() < 2) return "";
        else{
            return s.charAt(endIndex) + s.substring(1,endIndex) + s.charAt(0);
        }
    }

    /**
        Requirement:
        -Create a method called hasVowel()
        -This method will take one String argument and it will return a boolean checking if String has any vowel or not

        NOTE: Vowels are = a, e, o, u, I
        NOTE: Ignore cases

     */

    public static boolean hasVowel(String str){
        String s = str.toLowerCase();
        return s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u");
    }

    /**
        Requirement:
        -Create a method called checkAge()
        -This method will take an int yearOfBirth as  argument and it will print message below based on the entry
        If the age is less than 16, then print “AGE IS NOT ALLOWED”
        If the age is 16 or more, then print “AGE IS ALLOWED”
        If the age is more than 100 or a future year entered, print “AGE IS NOT VALID”
        NOTE: Calculate the age taking base year as current year in a dynamic way. You can use Date class.
     */

    public static String checkAge(int yearOfBirth){
        int age = Integer.parseInt(new SimpleDateFormat("y").format(new Date())) -yearOfBirth;
        if (age > 100) return "AGE IS NOT VALID";
        else if (age >= 16) return "AGE IS ALLOWED";
        else return "AGE IS NOT ALLOWED";
    }

    /**
        Requirement:
        -Create a method called averageOfEdges()
        -This method will take three int arguments, it will return average of min and max numbers
     */

    public static int averageOfEdges(int a, int b, int c){
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);

        return (max+min) / 2;
    }

    /**
        Requirement:
        -Create a method called noA()
        -This method will take a String array argument, and it will return a
         new array with all elements starting with A or a replaced with “###”

        NOTE: Assume length will always be more than zero
        NOTE: Ignore cases
            */

        public static String[] noA(String[] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].toLowerCase().startsWith("a")){
                    arr[i] = "###";
                }
            }
            return arr;
        }

    /**
        Requirement:
        -Create a method called no3or5()
        -This method will take an int array argument, and it will return a new array with some elements replaced as below
        If element can be divided by 5, replace it with 99
        If element can be divided by 3, replace it with 100
        If element can be divided by both 3 and 5, replace it with 101

        NOTE: Assume length will always be more than zero
     */
    public static int[] no3or5(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 15 == 0) arr[i] = 101;
            else if (arr[i] % 3 == 0) arr[i] = 100;
            else if (arr[i] % 5 == 0) arr[i] = 99;
            }
        return arr;
    }
    /**
        Requirement:
        -Create a method called countPrimes()
        -This method will take an int array argument and it will return how many elements in the array are prime numbers

        NOTE: Prime number is a number that can be divided only by 1 and itself
        NOTE: Negative numbers cannot be prime
        Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
        NOTE: Smallest prime number is 2
     */
    public static int countPrimes(int[] arr){
        int count = 0;
        for (int k : arr) {
            if (k == 2 || k == 3) count++;
            else if (k > 3) {
                boolean prime = true;
                for (int j = 2; j < k / 2; j++) {
                    if (k % j == 0) {
                        prime = false;
                        break;
                    }

                }
                if (prime) count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {


        System.out.println("---- Testing method 2 ------");
        System.out.println(replaceFirstLast("a"));
        System.out.println(replaceFirstLast("   a    "));
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(replaceFirstLast("Tech Global"));

        System.out.println("---- Testing method 3 ------");
        System.out.println(hasVowel(""));
        System.out.println(hasVowel("Java"));
        System.out.println(hasVowel("1234"));
        System.out.println(hasVowel("ABC"));

        System.out.println("---- Testing method 4 ------");
        System.out.println(checkAge( 2006));
        System.out.println(checkAge( 2005));
        System.out.println(checkAge( 2050));
        System.out.println(checkAge( 1920));
        System.out.println(checkAge( 1800));

        System.out.println("---- Testing method 5 ------");
        System.out.println(averageOfEdges(0,0,0 ));
        System.out.println(averageOfEdges( 0,0,6));
        System.out.println(averageOfEdges( -2,-2,10));
        System.out.println(averageOfEdges( -3,15,-3));
        System.out.println(averageOfEdges( 10,13,20));

        System.out.println("---- Testing method 6 ------");
        String[] i = {"java", "hello", "123","xyz"};
        System.out.println(Arrays.toString(noA(i)));
        String[] j = {"appium", "hello", "ABC","xyz"};
        System.out.println(Arrays.toString(noA(j)));

        System.out.println("---- Testing method 7 ------");
        int[] k = {7, 4, 11,17};
        System.out.println(Arrays.toString(no3or5(k)));
        int[] l = {3, 4, 5,6};
        System.out.println(Arrays.toString(no3or5(l)));

        System.out.println("---- Testing method 8 ------");
        int[] m = {-10, -3, 0,1};
        System.out.println(countPrimes(m));
        int[] q = {7, 4, 11,23,17};
        System.out.println(countPrimes(q));
        int[] r = {41, 53, 19,47,67};
        System.out.println(countPrimes(r));

    }
}

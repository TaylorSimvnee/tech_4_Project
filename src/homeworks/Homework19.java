package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Homework19 {
    /**
     -Create a method called noDigit()
     -This method will take one String argument and it will return a new String with all digits removed from the original String
     */

    public static String noDigit(String str){
        return str.replaceAll("[0-9]", "");
    }
    /**
     -Create a method called noVowel()
     -This method will take one String argument and it will return a new String with all vowels removed from the original String
     */

    public static String noVowel(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    /**
     * -Create a method called sumOfDigits()
     * -This method will take one String argument and it will return an int sum of all digits from the original String.
     */
    public static int sumOfDigits(String str) {
        List<String> sum = new ArrayList<>(Arrays.asList(str.split("")));
        int newSum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                newSum += Integer.parseInt(sum.get(i));
            }
        }
        return newSum;
    }
        /**
         -Create a method called hasUpperCase()
         -This method will take one String argument and it will return boolean true if there is an uppercase letter and false otherwise.
         */

    public static boolean hasUpperCase(String str) {
        boolean upperCase = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCase = true; break;
            }
        }
        return upperCase;
    }
        /**
         -Create a method called middleInt()
         -This method will take three int arguments and it will return the middle int.
         */
        public static int middleInt(int a, int b, int c){
            int middle;
            if (a>b && b>=c) middle = b;
            else if (b>a && a>=c) middle = a;
            else middle = c;
            return middle;
        }

        /**
         -Create a method called no13()
         -This method will take an int array as argument and it will return a new array with all 13 replaced with 0.
         */

        public static int[] no13(int[] arr){
            for (int num : arr) {
                if (num == 13) num = 0;
            }
            return arr;
        }
        /**
         -Create a method called arrFactorial()
         -This method will take an int array as argument and it will return the array with every number replaced with their factorials.
         */
        public static int[] arrFactorial(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0 || arr[i] == 1) arr[i] = 1;
                else {
                    int number = arr[i];
                    for (int j = 2; j < number; j++) {
                        arr[i] *= j;
                    }
                }
            }
            return arr;
        }
        /**
         -Create a method called categorizeCharacters()
         -This method will take String as an argument and return a String array as letters at index of 0, digits at index of 1 and specials at index of 2.
         */
        public static String[] categorizeCharacters(String str) {
            String letters ="";
            String digits ="";
            String specials ="";

            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) letters += str.charAt(i);
                else if (Character.isDigit(str.charAt(i))) digits += str.charAt(i);
                else specials += str.charAt(i);
            }

            return new String[]{letters, digits, specials};
        }

    public static void main(String[] args) {

        System.out.println("\nMethod 1\n");
        System.out.println(noDigit(""));
        System.out.println(noDigit("Java"));
        System.out.println(noDigit("123Hello 380"));
        System.out.println(noDigit("123Hello380World"));

        System.out.println("\nMethod 2\n");
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("123$"));
        System.out.println(noVowel("TechSuper"));

        System.out.println("\nMethod 3\n");
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John is 29"));
        System.out.println(sumOfDigits("$125.0"));

        System.out.println("\nMethod 4\n");
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John c green"));
        System.out.println(hasUpperCase("123hello380world"));

        System.out.println("\nMethod 5\n");
        System.out.println(middleInt(1,1,1));
        System.out.println(middleInt(1,2,2));
        System.out.println(middleInt(5,5,8));
        System.out.println(middleInt(5,3,5));
        System.out.println(middleInt(-1,25,10));

        System.out.println("\nMethod 6\n");
        int[] a= {1, 2, 3, 4};
        int[] b= {13, 2, 3};
        int[] c= {13, 2, 13, 13};
        System.out.println(Arrays.toString(no13(a)));
        System.out.println(Arrays.toString(no13(b)));
        System.out.println(Arrays.toString(no13(c)));

        System.out.println("\nMethod 7\n");
        int[] d= {1, 2, 3, 4};
        int[] e= {0, 2, 4, 1};
        int[] f= {5, 0, 6};
        System.out.println(Arrays.toString(arrFactorial(d)));
        System.out.println(Arrays.toString(arrFactorial(e)));
        System.out.println(Arrays.toString(arrFactorial(f)));


        System.out.println("\nMethod 8\n");
        System.out.println(Arrays.toString(categorizeCharacters("")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));


    }
    }

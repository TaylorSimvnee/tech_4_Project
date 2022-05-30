package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {
    /**
     -Create a method called hasLowerCase()
     -This method will take a String argument, and it will return boolean true if there is lowercase letter and false if it doesn’t.
     */
    public static boolean hasLowerCase(String str){
        boolean has = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                has = true; break;
            }
        }
        return has;
    }

    /**
     -Create a method called noZero()
     -This method will take one Integer ArrayList argument and it will return an ArrayList with all zeros removed from the original Integer ArrayList.

     NOTE: Assume that ArrayList size will be at least 1.
     */
    public static ArrayList<Integer> noZero(ArrayList<Integer> integerArrayList){
        integerArrayList.removeIf(integer -> integer == 0);
        return integerArrayList;
    }

    /**
     -Create a method called numberAndSquare()
     -This method will take an int array argument and it will return a multidimensional array with all numbers squared.
     */
    public static int[][] numberAndSquare(int[] ints){
        int[][] intsSquare = new int[ints.length][2];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) intsSquare[i][j] = ints[i];
                else intsSquare[i][j] = intsSquare[i][0] * intsSquare[i][0];
            }
        }
        return intsSquare;
    }
    /**
     -Create a method called containsValue()
     -This method will take a String array and a String argument, and it will return a boolean. Search the variable inside of the array and return true if it exists in the array. If it doesn’t exist, return false.
     NOTE: Assume that array size is at least 1.
     NOTE: The method is case-sensitive
     */
    public static boolean containsValue(String[] arr, String str){
        Arrays.sort(arr);
        int searchIndex = Arrays.binarySearch(arr, str);
        return (searchIndex > 0);
    }
    /**
     -Create a method called reverseSentence()
     -This method will take a String argument and it will return a String with changing the place of every word. All words should be in reverse order. Make sure that there are two words inside the sentence at least. If there is no two words return “There is not enough words!”.

     NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!
     */
    public static String reverseSentence(String str){ //FIX UPPER AND LOWER
        StringBuilder reversed = new StringBuilder();
        if (!str.trim().contains(" ")) return "There are not enough words!";
        else {
        String[] splitStr = str.trim().split(" ");
            for (int i = splitStr.length-1 ; i > 0; i--) {
                reversed.append(" ").append(splitStr[i]);
            }
        }
        return reversed.toString().trim();
    }
    /**
     -Create a method called removeStringSpecialsDigits()
     -This method will take a String as argument, and it will return a String without the special characters or digits.
     NOTE: Assume that String length is at least 1.
     NOTE: Do not remove spaces.
     */
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^A-Za-z ]","");
    }
    /**
     -Create a method called removeArraySpecialsDigits()
     -This method will take a String array as argument, and it will return a String array without the special characters or digits from the elements.
     NOTE: Assume that array size is at least 1.
     */
    public static String[] removeArraySpecialsDigits(String[] arr){
        for (int i = 0; i < arr.length; i++) {
           arr[i] = arr[i].replaceAll("[^A-za-z ]", "");
        }
        return arr;
    }
    /**
     -Create a method called removeAndReturnCommons()
     -This method will take two String ArrayList and it will return all the common words as String ArrayList.
     NOTE: Assume that both ArrayList sizes are at least 1.
     */
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> a, ArrayList<String> b){
        ArrayList<String> multiples = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i))) multiples.add(a.get(i));
        }
        return multiples;
    }

    /**
     -Create a method called noXInVariables()
     -This method will take an ArrayList argument, and it will return an ArrayList with all the x or X removed from elements.
     If the element itself equals to x or X or contains only x letters, then remove that element.
     NOTE: Assume that ArrayList size is at least 1.
     */
    public static ArrayList<String> noXInVariables(ArrayList<String> strings){
        ArrayList<String> strings1 = new ArrayList<>();
        for (String string : strings) {
            String xyz = string.replaceAll("[xX]", "");
            if (xyz.length() > 0) strings1.add(xyz);
        }
        return strings1;
    }



    public static void main(String[] args) {
        System.out.println("\nTesting method1");
        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hola"));


        System.out.println("\nTesting method4");
        String[] s = {"abc","foo","java"};
        String[] s2 = {"abc","def","123","Java"};
        System.out.println(containsValue(s,"hello"));
        System.out.println(containsValue(s2,"123"));

        System.out.println("\nTesting method5");
        System.out.println(reverseSentence("Hola"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("\nTesting method6");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 12&Cypress"));

        System.out.println("\nTesting method7");
        String[] s3 = {"123Java","#$%is","fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(s3)));

        System.out.println("\nTesting method8");
        ArrayList<String> a = new ArrayList<>();
        a.add("Java");
        a.add("is");
        a.add("fun");
        ArrayList<String> b = new ArrayList<>();
        b.add("abc");
        b.add("is");
        b.add("123");
        System.out.println(removeAndReturnCommons(a,b));

    }
}

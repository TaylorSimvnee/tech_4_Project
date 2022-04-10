package javaMemoryManagements;

public class ReverseExercise {


    //Loop logic
    public static String reverse1(String s){

        String r = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            r+= s.charAt(i);
        }
        return r; //by using string the memory will put each iteration into the pool inside of HEAP.. vs appending with string Builder, it will only create one and append that one with each iteration
    }
     //String builder from here down
    public static String reverse2(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String reverse3(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverse4(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}

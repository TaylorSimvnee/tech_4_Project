package stringMethods;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {
        /*
        Method Task: these methods are used to convert letters of a String to uppercase or lowercase
        -They are non-static method - because you call the method from an objects of String class
        -They are return type methods, and they return the modified String object back
        -They don't take any argument
         */

        String s1 = "Hello world";

        System.out.println(s1); // Hello world
        System.out.println(s1.toLowerCase()); // hello world
        System.out.println(s1.toUpperCase()); // HELLO WORLD
    }
}

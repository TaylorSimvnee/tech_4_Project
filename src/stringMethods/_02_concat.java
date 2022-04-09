package stringMethods;

public class _02_concat {
    public static void main(String[] args) {
        /*
        Method Task - combine multiple Strings, and form a new one
        -It is non-static, and we can call it with an object created
        -It is a return type method, and it returns a new String that is a combination of the others
        -It takes a String as an argument
         */

        String s1 = "Tech"; // String Object
        String s2 = "Global";// String Object

        String s3 = s1.concat(s2); // String s3 = s1 + s2;

        System.out.println(s3); // TechGlobal

        System.out.println("Hello".concat(" World!")); // Hello World!
        System.out.println("Hello".concat(" " + "World!")); // Hello World!

    }
}

package stringMethods;

public class _01_valueOf {
    public static void main(String[] args) {
        /*
        Method task: convert given variable to String
        -It is static - you can call it with class name
        -it is a return type, and it returns a String
        -It takes different arguments a sit is a overloaded method and converts given args to a String
         */

        int i =5;

        String num = String.valueOf(i);

        System.out.println(i + i);
        System.out.println(num + num);



    }
}

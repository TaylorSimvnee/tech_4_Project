package stringMethods;

public class _11_startsWith_endsWith {
    public static void main(String[] args) {
        /*
        Method Task: They are used for finding out if the String starts with or ends with another letter or String
        -They are non-static as we call them with objects
        -They return boolean
        -They take STRING as an argument
         */

        String str = "Today is Sunday";

        System.out.println(str.startsWith("Today"));//true
        System.out.println(str.startsWith("today"));//false
        System.out.println(str.endsWith("day"));//false

        System.out.println(str.toUpperCase().endsWith("SUNDAY")); //true

        System.out.println(str.startsWith("is",6)); // true
                                                // this will offset to what point in the index you want to start looking

        //System.out.println("Hello".startsWith('H')); // compiler error. startsWith snd endsWith takes STRING
    }
}

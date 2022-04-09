package stringMethods;

public class _03_equals {
    public static void main(String[] args) {
        /*
        Method Task:  It compares 3 strings with each other and tells if they are equal or not
        NOTE: this comparison is case-sensitive
        -It is non-static, and wwe call it with another String Object
        -It is a return type and returns a boolean
        -It takes a String as an argument
         */
        System.out.println("Taylor".equals("Taylor")); // true
        System.out.println("Taylor".equals("taylor")); // false

        String name1 = "John";
        String name2 = "James";
        String name3 = "James";


        System.out.println(name1.equals(name2)); // false
        System.out.println(name2.equals(name3));//true

        System.out.println("\n------Practice-----\n");

        String str1 = "Hello";
        String str2 = str1; // str2 = "Hello"

        boolean b = !(str1.equals(str2)); // false

        System.out.println(b); // false

        System.out.println(!"abc".concat("xyz").equals("abcx" + "yz")); // false -- prioritize parenthesis



    }
}

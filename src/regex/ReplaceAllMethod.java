package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        //Removing vowels
        String str = "Hello World";
        System.out.println( "Before: "  + str);


        str = str.replaceAll("[aeioAEIO]", "\\$");
        System.out.println("After: " + str);

        //Removing Digits

        String str2 = "Hello123world";
        System.out.println( "Before: "  + str2);


        str = str.replaceAll("[0-9]", " ");
        System.out.println("After: " + str);

        System.out.println("ab110c045d".replaceAll("[^0-9]",""));


    }
}

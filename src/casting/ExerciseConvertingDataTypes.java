package casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args) {

        /*
        Write a program which will take two numbers as a STRING and get the AVG of them and print it out

        input:
        String num1+ "23"
        String num2 = "25"

        output:
        24
         */


        String num1 = "23";
        String num2 = "25";

        int num1Int = Integer.parseInt(num1); // String -->int
        int num2Int = Integer.parseInt(num2);

        Integer num1Integer = Integer.valueOf(num1);
        Integer num2Integer = Integer.parseInt(num2); // String --> int -> Integer


        System.out.println("Ave with int is = " + (num1Int+num2Int)/2);
        System.out.println("Ave with Integer is = " + (num1Integer + num2Integer)/2);

        // task 2

        /*
Assume David is going to save  $390 to buy a bicycle.
David can save only $15.60 per day. How many days later,
David can save $390 and buy the bicycle.

Requirement:
Write a java program to solve this problem given above

Input:
String save = 390;
String day = 15.60;

Expected Output:
25
*/

        String save = "390";
        String day = "15.60";

        double saveDouble = Double.parseDouble(save); // same method same class
        double dayDouble = Double.parseDouble(day);

        System.out.println((int)(saveDouble /dayDouble)); // REQUIREMENT IS A WHOLE NUMBER, SO CHANGE TO INT BY EXPLICIT CASTING


    }
}

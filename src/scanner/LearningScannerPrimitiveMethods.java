package scanner;
import java.util.Scanner; //How you import
public class LearningScannerPrimitiveMethods {
    public static void main(String[] args){
        /*
                   -How to use Scanner methods-
        1.Create an object of scanner (import the class as well)
         ClassName/DataType variableName/objectName = new ClassName/DataType(if it is needed);
        2. variableName/objectName.methodName(if it is needed parameter);
         */

        /*
        Task-1
        1. Ask user to enter their age
        2. Print the question
        3. Use the proper next method (nextInt)
        4. Print out the users age
         */

        Scanner collect = new Scanner(System.in);

        System.out.println("What is your age?");
        int userAge = collect.nextInt();

        System.out.println("Users age is = " + userAge);

    System.out.println("What is your account balance?");
    double userAccountBalance = collect.nextDouble();

    System.out.println("\n\t\'The users account balance\' = \"$" + userAccountBalance +"\"");


    System.out.println("Are you understanding this Java class today?");
    boolean  userAnswer = collect.nextBoolean();

    System.out.println("Does the student understand class today = " + userAnswer );


    }


}

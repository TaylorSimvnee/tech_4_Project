package scanner;

import java.util.Scanner; //scanner is a class. Lower case "java" = package
public class LearningScannerMultipleLines {
    public static void main(String[] args) {


        // DataType variableName = data/value <-- Creating a Variable
        //DataType/ClassName variableName = new DataType/ClassName(if needed); <-- Creating Object
        Scanner inputReader = new Scanner(System.in); //Everytime you create a new object use "new" Keyword

        System.out.println("What is your address?");
        String userAddress = "\"" + inputReader.nextLine() +"\""; // How to use method --> (String) Store it with variableName = VariableNAme.methodName();

        System.out.println("User adress is =".concat(userAddress));

    }
}

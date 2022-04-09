package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args){

        String tech = "Tech";
        String variableName = "Global";


        String schoolName = tech + variableName;  // + operator
        String schoolName2 =  tech.concat(variableName); // concat method

        // print = a method type

        System.out.print(tech);
        System.out.print("\n" + schoolName);

    }
}

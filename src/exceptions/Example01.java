package exceptions;

public class Example01 {
    public static void main(String[] args) {

        /*
        Handle the  unchecked exception below and report with a message
         */

        String[] names = {"Alex", "John", "Max"};

        try {
            System.out.println(names[-5]);
        }catch (ArrayIndexOutOfBoundsException e){
         e.printStackTrace(); // What is used in the company
//            System.out.println(e.getLocalizedMessage());  //Not used...not enough info
//            System.out.println(e); // not used
        }

        System.out.println("End of program");

    }
}

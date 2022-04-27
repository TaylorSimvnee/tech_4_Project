package exceptions;

public class Exception02 {
    public static void main(String[] args) {

        int number = 45;

        try{
            System.out.println(number / 3);
            System.out.println(number / 0);
        }catch (Exception e){ //Always go with exception. It is the parent of all, it will cover ANY exception
           e.printStackTrace();
        }
        System.out.println("End of program");

    }
}

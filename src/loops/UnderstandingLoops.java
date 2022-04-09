package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {

        // write program to print "Hello" 5 times

        /*
        SYNTAX:
        for(start; termination; update){
                // Block of code to execute
                }
         */
            // you can do ++ or --, so long as the logic is correct. if not, you may create an infant loop.
        int year = 2022;
                            // Runs based on termination(second condition)(endPoint)..meaning it will run until. or it wont run becuase of.
        for(int age = 10; age <=35; age++){ //post increment
            System.out.println("The age is = " + age + " in " + year);
            year++;

        }
        // i , j , k --> is the order. For loop/ i loop/ traditional loop/ traditional i loop/ fori

    }
}

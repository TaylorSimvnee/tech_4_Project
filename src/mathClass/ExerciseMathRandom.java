package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args) {

        /*
        Create a program which is generating a random number between 45 - 98
        and print it out.



              formula for random:
                  (int) (Math.random() * (endPoint - startPoint + 1) + startPoint)
        */



        System.out.println( (int) (Math.random() *54 +45)  );


        /*
        Create a program which is generating two random number between 67 - 85
        and print out numb 1 and numb 2 and max and min.

        67 - 85   (Math.random * 19) + 67
        3 - 25    (Math.random * 23) + 3
        25 - 35   (Math.random * 11) + 25
        50 - 200  (Math.random * 151) + 50

        */

        int random1 = (int) (Math.random() * 19 + 67);
        int random2 = (int) (Math.random()* 19 + 67);
            // come back and give below a pretty message. declare the number 1
        //    and two and the max and min in one statement, multiple lines

        System.out.println("First number is");
        System.out.println(Math.min(random1, random2));
        System.out.println(Math.max(random1,random2));



    }
}

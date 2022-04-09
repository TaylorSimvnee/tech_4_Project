package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        /*
        TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */


        int[] numbers = { 10, -3, -7, 0, 0, 7, 22};

        for (int number : numbers) {
            System.out.println(number);}

            System.out.println("Task 2");
            int sum = 0;
            for (int number_ : numbers){
                sum += number_;
            }
            System.out.println(sum);

        System.out.println("Task 3");

        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum2 += numbers[i];
        }
        System.out.println(sum2);
        /*
        TASK-4
        Find the sum of last 5 elements in the array
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        22
         */

        System.out.println("Task 4");

        int sum3 = 0; // 2 3 4 5 6
        for (int i = numbers.length - 5; i < numbers.length; i++) {
            sum3 += numbers[i];
        }
        System.out.println(sum3);

        int sum4 = 0; //6 5 4 3 2 wrong
        for (int i = numbers.length-1; i > numbers.length-5; i--) {
            sum4 += numbers[i];
        }
        System.out.println(sum4);

        System.out.println("Task 5");
        int productOfLast4 = 1;
        for (int i = numbers.length - 4; i < numbers.length; i++) {
            if (numbers[i]!=0) productOfLast4 *= numbers[i];

        }
        System.out.println(productOfLast4);

        System.out.println("Task 6");

        boolean anyZero = false;
        for (int number_ : numbers){
            if (number_ == 0) {
                anyZero = true;
                break;
            }
        }
        System.out.println(anyZero);








    }
}

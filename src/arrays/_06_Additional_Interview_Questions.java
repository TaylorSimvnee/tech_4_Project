package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        /*

         */

        int [] numbers = {5, 3, 0, -1};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length -1]);




        double[] doubles = { 2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        /*
TASK-2
Create a double array and store below elements
{2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}

Find the minimum value

RESULT:
0.5
 */

        double min = doubles[2];
        for(double doubles_ : doubles){
            min = Math.min(min,doubles_);
        }
        System.out.println(min);

        double min2 = doubles[2];
        for(double doubles_ : doubles){
            if(doubles_ < min2) {min2 = doubles_;}
        }











    }
}

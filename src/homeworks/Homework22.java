package homeworks;

import java.util.Arrays;
import java.util.function.Predicate;

public class Homework22 {
    public static void main(String[] args) {
        System.out.println("\nTask1\n");
        System.out.println(Arrays.toString(fibonacciSeries1(6)));

        System.out.println("\nTask2\n");
        System.out.println(fibonacciSeries2(8));
    }

    // ------------------👾 Task 1 👾------------------\\

    public static int[] fibonacciSeries1(int n) {
        int[] series = new int[n];
        int sum, num1 = 1, num2 = 0;
        for (int i = 0; i < n; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            series[i] = sum;
        }
        return series;
    }

    // ------------------🌾 Task 2 🌾------------------\\

    public static int fibonacciSeries2(int n){
        if(n == 1 || n == 0) return n;
        else if(n< 0) throw new RuntimeException("This input is not acceptable");
        return (fibonacciSeries2(n -1) + fibonacciSeries2(n-2));
    }

    // ------------------👾 Task 3 👾------------------\\

    public static int[] findUniques(int[] a, int[] b){
        if(a.length == 0 || b.length == 0) return new int[0];
        int i = 0;
        while ()
    }
}

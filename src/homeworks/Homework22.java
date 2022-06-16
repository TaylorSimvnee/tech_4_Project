package homeworks;

import java.util.Arrays;

public class Homework22 {
    public static void main(String[] args) {
        System.out.println("\nTask1\n");
        System.out.println(Arrays.toString(fibonacciSeries1(6)));

        System.out.println("\nTask2\n");
        System.out.println(fibonacciSeries2(8));
        System.out.println(fibonacciSeries2(0));
        try {
            System.out.println(fibonacciSeries2(-5));
        }catch (Exception e){ }

        System.out.println("\nTask3\n");

        System.out.println("\nTask4\n");
        System.err.println(isPowerOf3(0));
        System.err.println(isPowerOf3(1));
        System.err.println(isPowerOf3(2));
        System.err.println(isPowerOf3(3));
        System.err.println(isPowerOf3(81));

//        System.out.println("\nTask5\n");
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

//    public static int[] findUniques(int[] a, int[] b){
//        if(a.length == 0 || b.length == 0) return new int[0];
//        int i = 0;
////        while ()
//    }

    // ------------------🌾 Task 4 🌾------------------\\

    public static boolean isPowerOf3(int i){
        int powerOf3 = 1, base = 1;
        for (int j = 0; j <= i; j++) {
            powerOf3 *=3;
            if (powerOf3 == i || base == i) return true;
        }
        return false;
    }

    // ------------------👾 Task 5 👾------------------\\


}

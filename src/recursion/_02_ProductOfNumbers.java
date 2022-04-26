package recursion;

public class _02_ProductOfNumbers {

    public static int product(int n){
        if(n >= 1) return n * product(n -1);
        return 1; // 1 not zero,, debug it.
    }

    //if else  so ^ the negative case in the else or below negative case is in the if

    public static int product2(int n){
        if(n == 1)  return 1; // 1 not zero,, debug it.
            return n * product2(n -1);
    }

    public static void main(String[] args) {

        System.out.println(product(5));
    }
}

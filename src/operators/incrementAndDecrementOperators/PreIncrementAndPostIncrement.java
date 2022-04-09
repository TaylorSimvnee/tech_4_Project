package operators.incrementAndDecrementOperators;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        int a = 10;

       // a = a + 1;
      //  a += 1;
        a++; //a = 10 + 1  (post - will become new value after new line)
        ++a; // a = 11 + 1 (pre - will become new value imediately)
        System.out.println(a);




    }
}

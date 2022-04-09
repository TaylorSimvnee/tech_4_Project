package operators.relationalOperators;

public class RelationOperators {
    public static void main(String[] args) {

        int a =4;
        int b =10;

        boolean isAEqualToB = a == b; // '=' is assign '==' A IS EQUAL TO B
        boolean isANotEqualToB = a != b; // a is not equal to b


        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a = b : " + isANotEqualToB);

        boolean isAGreaterThanB = a > b;
        boolean isALessThanB = a < b;
        boolean isAGreaterThanOrEqualToB = a >= b;
        boolean isALessThanOrEqualToB = a <= b;


        System.out.println("a > b : " + isAEqualToB); //false
        System.out.println("a < b : " + isANotEqualToB); //true
        System.out.println("a >= b : " + isANotEqualToB); //false
        System.out.println("a <= b : " + isANotEqualToB); //true






    }
}

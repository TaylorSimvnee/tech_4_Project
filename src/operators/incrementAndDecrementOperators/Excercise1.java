package operators.incrementAndDecrementOperators;

public class Excercise1 {
    public static void main(String[] args) {

        int i = 5;
        int age = 10 * ++ i; //10 * 6
        System.out.println("age = " + age); // 60
        System.out.println(i);
                            // ask yourself 2 questions. 1. How many times is it incremented?
                                                        // 2. When?

        age = 10 * i; // 60
        System.out.println(age);

        age = 10 * i++;
        System.out.println(age); // 60

        age = 10 * i;
        System.out.println(age); // 70


    }
}

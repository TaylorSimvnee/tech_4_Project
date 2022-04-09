package collections.arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        System.out.println(numbers.size());// 3
        System.out.println(numbers); // [5,7,10]

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        System.out.println("Printing all elements with for i loop");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("Printing all elements with for each loop");
        for (Integer number : numbers) {
            System.out.println(numbers.get(number));
        }



    }
}

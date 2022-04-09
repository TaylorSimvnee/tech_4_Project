package collections;

import java.util.*;

public class ConvertingListToEachOther {
    public static void main(String[] args) {

        /*
        ArrayList - LinkedList
        LinkedList - ArrayList
        Vector - ArrayList
        ArrayList - Vector
        .
        .
         */


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("The ArrayList is = " + numbers);

        //Converting ArrayList to a LinkedList
        LinkedList<Integer> number2 = new LinkedList<>(numbers);
        System.out.println("The LinkedList is = " + number2);

        //Converting LinkedList to an ArrayList
        ArrayList<Integer> numbers3 = new ArrayList<>(number2); // () -> ArrayList constructor

        String[] namesArr = {"Kaly", "Torrie", "Taylor"};

        Vector<String> names = new Vector<>();
        Collections.addAll(names, namesArr);
        System.out.println(names);






    }
}

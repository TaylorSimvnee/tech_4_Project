package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {


        System.out.println("\n    int array\n");
        int[] numbers = {1, 5, 7, 9, 10};
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n    int array\n");

        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));


        System.out.println("\n    String ArrayList\n");
        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, cities);

        System.out.println(cities2);

        System.out.println("\n    String Vector\n");
        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size());
       names.forEach(System.out::println);
        System.out.println("Name at Index of 5 = " + names.get(5));


        System.out.println("\n    String LinkedList\n");
        LinkedList<String> objects1 = new LinkedList<>();
        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);

        System.out.println(objects1.getLast());
        System.out.println(objects1);
        System.out.println(  objects1.stream().filter(element -> element == null).count());


    }
}
package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {


        System.out.println("Task-1");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\nTask-2");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\nTask-3");
        List<Integer> integers = new ArrayList<>();
        integers.add(23);
        integers.add(-34);
        integers.add(-56);
        integers.add(0);
        integers.add(89);
        integers.add(100);

        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);

        System.out.println("\nTask-4");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\nTask-5");
        List<String> marvelC = new ArrayList<>();
        marvelC.add("Spider Man");
        marvelC.add("Iron Man");
        marvelC.add("Black Panther");
        marvelC.add("Deadpool");
        marvelC.add("Captain America");

        System.out.println(marvelC);
        System.out.println(marvelC.contains("Wolverine"));


        System.out.println("\nTask-6");
        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("\nTask-7");
        Character[] chars = {'A', 'x', '$', '%', '9', '*', '+', 'F', 'G'};
        List<Character> characterList = new ArrayList<>();
        Collections.addAll(characterList, chars);
        System.out.println(characterList);

        for (Character character : characterList) {
            System.out.println(character);
        }

        System.out.println("\nTask-8");
        List<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);
        int countM = 0;
        int countNoAE = 0;
        for (String object : objects) {
            if (object.toLowerCase().startsWith("m")) countM++;
            if (!(object.toLowerCase().contains("a") || object.toLowerCase().contains("e"))) countNoAE++;
        }
        System.out.println(countM);
        System.out.println(countNoAE);

        System.out.println("\nTask-9");

        String[] kObject = {"Plate", "spoon", "fork", "Knife", "cup", "Mixer"};
        ArrayList<String> kitchenObjects = new ArrayList<>(Arrays.asList(kObject));

        System.out.println(kitchenObjects);

        int upper = 0;
        int lower = 0;
        int containsP = 0;
        int sEP = 0;

        for (String kitchenObject : kitchenObjects) {
            if (Character.isUpperCase(kitchenObject.charAt(0))) upper++;
            if (Character.isLowerCase(kitchenObject.charAt(0))) lower++;
            if (kitchenObject.toLowerCase().contains("p")) containsP++;
            {
                if (kitchenObject.toLowerCase().endsWith("p") || kitchenObject.toLowerCase().startsWith("p")) sEP++;
            }
        }

        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase =" + lower);
        System.out.println("Elements having P or p= " + containsP);
        System.out.println(" Elements starting or ending with P or p = " + sEP);

        System.out.println("\nTask-10");

        Integer[] numbs = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        List<Integer> numbList = new ArrayList<>(Arrays.asList(numbs));
        System.out.println(numbList);

        int by10 = 0;
        int great15 = 0;
        int less20 = 0;
        int lessGreater = 0;


        for (Integer integer : numbList) {
            if (integer % 10 == 0) by10++;
            if (integer % 2 == 0 && integer > 15) great15++;
            if (integer % 2 == 1 && integer < 20) less20++;
            if (integer < 15 || integer > 50) lessGreater++;
        }
        System.out.println("Elements that can be divided by 10 = " + by10);
        System.out.println("Elements that are even and greater than 15 = " + great15);
        System.out.println("Elements that are odd and less than 20 = " + less20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessGreater);
    }
}

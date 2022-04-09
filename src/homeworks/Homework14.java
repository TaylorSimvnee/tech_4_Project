package homeworks;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("Task-1");

        int[] numbers_ = {4, 0, -7, 0, 5, 10, 45, 45};
        int foundDuplicate = 0;
        for (int i = 0; i < numbers_.length; i++) {
            for (int j = i + 1; j < numbers_.length; j++) {

                if (numbers_[i] == numbers_[j] && foundDuplicate < 1) {
                    System.out.println("First duplicated number = " + numbers_[i]);
                    foundDuplicate++;
                    break;
                }
            }
        }
        if (foundDuplicate == 0) System.out.println("There are no duplicates");


        System.out.println("\nTask-2");

        String[] words = {"Z", "java", "z", "abc"};
        int duplicate = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println("First duplicate word = " + words[i]);
                    duplicate++;
                    break;
                }
            }
        }
        if (duplicate == 0) System.out.println("There are no duplicates");

        System.out.println("\nTask-3");

        int[] numbers = {0, -4, 9, 0, 5, 10, 45, -7, -7};

        int count = 1;
        boolean dupFound = false;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate #" + count + " = " + numbers[i]);
                    count++;
                    dupFound = true;
                }
            }
        }
        if (!dupFound) System.out.println("There are no duplicates");

        System.out.println("\nTask-4");

        String[] words2 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        int counter = 1;
        String s = "";
        boolean isDupFound = false;
        for (int i = 0; i < words2.length; i++) {

            for (int j = i + 1; j < words2.length; j++) {
                if (words2[i].equalsIgnoreCase(words2[j]) && !s.contains(words2[i].toLowerCase())) {
                    System.out.println("Duplicated word #" + counter + " = " + words2[i]);
                    s += words2[i].toLowerCase();
                    counter++;
                    isDupFound = true;
                }
            }
        }
        if (!isDupFound) System.out.println("There is no duplicates");

        System.out.println("\nTask-5");

        String[] words1 = {"abc", "foo", "bar"}; // 1 2 3 -> 3 2 1
        String[] reverseWords1 = new String[words1.length];
        int counter_ = 0;
        for (int i = words1.length - 1; i >= 0; i--) {
            reverseWords1[counter_] = words1[i];
            counter_++;
        }
        System.out.println(Arrays.toString(reverseWords1));


        System.out.println("\nTask-6");

        String str = "Today is a fun day";
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        String[] split = str2.split(" ");
        String[] reverseWords = new String[split.length];

        int count_ = 0;
        for (int i = split.length - 1; i >= 0; i--) {
            reverseWords[count_] = split[i];
            System.out.print(reverseWords[count_] + " ");
            count_++;
        }

    }
}

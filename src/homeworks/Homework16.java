package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {

    //task1
    public static int countWords(String str){
        if(str.isEmpty() || str.trim().isEmpty()) return 0;
        int spaces = 0;
        for (int i = 0; i < str.trim().length(); i++) {
            if(str.trim().charAt(i) == ' ') spaces++;
        }
        return spaces + 1;
    }
    //task2
   public static int countA(String str){
        if(str.isEmpty() || !str.toLowerCase().contains("a")) return 0;
        int a = 0;
       for (int i = 0; i < str.trim().length(); i++) {
           if (str.trim().toLowerCase().charAt(i) == 'a') a++;
       }
       return a;
   }
    //task3
   public static int countPos(ArrayList<Integer> arr){
        int pos = 0;
       for (Integer integer : arr) {
           if (integer > 0) pos++;
       }
       return pos;
   }

   //task4
   public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> arr){
       ArrayList<Integer> num = new ArrayList<>();
       for (Integer integer : arr) {
           if(!num.contains(integer)) num.add(integer);
       }
       return num;
   }

    //Task-5
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> arr){
        ArrayList<String> s = new ArrayList<>();
        for (String string : arr) {
            if(!s.contains(string)) s.add(string);
        }
        return s;

    }

    //Task-6
    public static String removeExtraSpaces(String str){
        String[] split = str.split(" ");
        StringBuilder sentence = new StringBuilder();
        for (String s : split) {
            if(!s.isEmpty()) sentence.append(" ").append(s);
        }
        return sentence.toString().trim();
    }

    //Task-7
        public static String add(int[] a, int[] b){
            int[] c = new int[Math.max(a.length, b.length)];
            for (int i = 0; i < Math.min(a.length, b.length); i++) {
                c[i] = a[i] + b[i];
            }
            for (int i = Math.min(a.length, b.length); i < Math.max(a.length, b.length); i++) {
                if (a.length > b.length) c[i] = a[i];
                else c[i] = b[i];
            }
            return Arrays.toString(c);
}

    //Task-8
    public static int findClosestTo10(int[] arr){
        int closest = Integer.MAX_VALUE;
        int current;
        int smallest = 0;

        for (int a : arr) {
            current = a;
            if(a !=10 && Math.abs(closest -10) == Math.abs(current -10)) smallest = Math.min(closest, current);
            else if(a !=10 && Math.abs(closest -10) > Math.abs(current -10)) closest = current;
            }

       return (smallest > 0) ? smallest : closest;
    }



    public static void main(String[] args) {
        System.out.println("-----Test method 1-----");
        System.out.println(countWords(""));
        System.out.println(countWords("  "));
        System.out.println(countWords("   the "));
        System.out.println(countWords(" Selenium is the most common UI automation tool.  "));

        System.out.println("-----Test method 2-----");
        System.out.println(countA(""));
        System.out.println(countA(" "));
        System.out.println(countA("   Banana   "));
        System.out.println(countA("TechGlobal is a QA bootcamp"));

        System.out.println("-----Test method 3-----");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(-45); num.add(0); num.add(0); num.add(34); num.add(5); num.add(67);
        System.out.println(countPos(num));

        System.out.println("-----Test method 4-----");
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(10); num2.add(20); num2.add(20); num2.add(10); num2.add(5);
        num2.add(5); num2.add(7); num2.add(6); num2.add(3); num2.add(5);
        System.out.println(removeDuplicateNumbers(num2));

        System.out.println("-----Test method 5-----");
        ArrayList<String> s = new ArrayList<>();
        s.add("java"); s.add("C#"); s.add("ruby"); s.add("JAVA");
        s.add("ruby"); s.add("c#"); s.add("C++"); s.add("C++");
        System.out.println(removeDuplicateElements(s));

        System.out.println("-----Test method 6-----");
        String str1 = "   I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(str1));
        String str2 = "Java is fun     ";
        System.out.println(removeExtraSpaces(str2));

        System.out.println("-----Test method 7-----");
        int[] a = {3, 0, 0, 7, 5, 10};
        int[] b = {6, 3, 2};

        System.out.println(add(a, b));

        System.out.println("-----Test method 8-----");
        int[] n1 = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(n1));

        int[] n2 = {10, -13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(n2));

        int[] n3 = {10, 1, 4, 6, 8, 9};
        System.out.println(findClosestTo10(n3));

    }
}

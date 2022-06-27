package homeworks;

import java.util.TreeMap;

public class Homework23 {
    public static void main(String[] args) {

        System.out.println("----Task 1----");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
        System.out.println("----Task 2----");
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Apple", 3); map.put("Mango", 1);
        System.out.println(calculateTotalPrice1(map));
        System.out.println("----Task 3----");
        TreeMap<String,Integer> map2 = new TreeMap<>();
        map2.put("Apple", 4); map2.put("Mango", 8); map2.put("Orange", 3);
        System.out.println(calculateTotalPrice2(map2));
    }

    //------------- Task 1 -------------\\
    public static TreeMap<Integer, String> parseData(String str){
        TreeMap<Integer, String> map = new TreeMap<>();
        String[] arr = str.split("[{-}]");

        for (int i = 1; i < arr.length-1; i=i+2){
            map.put(Integer.valueOf( arr[i]), arr[i+1]);
        }

        return map;
    }

    //------------- Task 2 -------------\\
    public static double calculateTotalPrice1(TreeMap<String , Integer> map){
        double total = 0;
        TreeMap<String , Double> priceMap = new TreeMap<>();
        priceMap.put("Apple", 2.00); priceMap.put("Orange", 3.29);
        priceMap.put("Mango", 4.99); priceMap.put("Pineapple", 5.25);

        for (String s : priceMap.keySet()) {
            if (map.containsKey(s)) {
                total += (map.get(s) * priceMap.get(s));
            }
        }
        return total;
    }

    //------------- Task 3 -------------\\

    public static double calculateTotalPrice2(TreeMap<String , Integer> map){
        double total = 0;
        TreeMap<String , Double> priceMap = new TreeMap<>();
        priceMap.put("Apple", 2.00); priceMap.put("Orange", 3.29);
        priceMap.put("Mango", 4.99); priceMap.put("Pineapple", 5.25);

        for (String s : priceMap.keySet()) {
            if (map.containsKey(s)) {
                if (s.equals("Apple") && map.get(s) >= 2){
                    int half = map.get(s)/2;
                    int full = half +1;
                    total +=  half + (priceMap.get(s) * half); break;
                }
                if (s.equals("Mango") && map.get(s) >= 4){
                    int free = map.get(s)/2;

                    total += (map.get(s) - free) * priceMap.get(s);
                }
                else total += (map.get(s) * priceMap.get(s));
            }
        }
        return total;
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static Map<String , Integer> count(String[] arr){
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
            else map.put(s,1);
        }
        return map;
    }

    public static void main(String[] args) {
        
    }
}

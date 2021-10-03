package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,3,5,6,7,8,3,6,8,1,3,2,4,3,6,7,8};
        Map<Integer, Integer> histogram = new HashMap<>();     
        for (int key : data) {
                histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        histogram.keySet().forEach((key) -> {
            System.out.println(key + "==>" + histogram.get(key));
        });
        
        
    }
    
}

package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,3,5,6,7,8,3,6,8,1,3,2,4,3,6,7,8};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.get(data[i])!=null){
                histogram.put(data[i], histogram.get(data[i])+1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        histogram.keySet().forEach((key) -> {
            System.out.println(key + "==>" + histogram.get(key));
        });
    }
    
}

package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {1,3,5,6,7,8,3,6,8,1,3,2,4,3,6,7,8};
        Histogram histo = new Histogram(data);       
        Map<Integer,Integer> histogr = histo.getHistogram();        
        histogr.keySet().forEach((key) -> { 
            System.out.println(key + "==>" + histogr.get(key));
        });
        
        
    }
    
}

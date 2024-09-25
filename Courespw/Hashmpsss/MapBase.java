package Courespw.Hashmpsss;

import java.util.*;

public class MapBase {
      public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Navneet", 99);
            map.put("Aastha", 88);
            map.put("Aasneet", 99);
            map.put("Sachin", 89);
            map.put("Sumit", 79);
            map.put("Aadii", 75);
            System.out.println(map);
            for(String key: map.keySet()){
                  System.out.println(key);
            }
      }
}

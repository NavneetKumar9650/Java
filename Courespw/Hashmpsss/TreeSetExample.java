package Courespw.Hashmpsss;

import java.util.*;

public class TreeSetExample {
      public static void main(String[] args) {
            // Corrected the type to String (not string)
            TreeMap<Integer, String> set = new TreeMap<>();
            
            // Adding key-value pairs to the TreeMap
            set.put(20, "Navneet");
            set.put(30, "Naddv");
            set.put(80, "Navneet");
            set.put(40, "Navneet");
            
            // Iterate over the keys of the TreeMap and print the key-value pairs
            for (Map.Entry<Integer, String> entry : set.entrySet()) {
                  System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
      }
}

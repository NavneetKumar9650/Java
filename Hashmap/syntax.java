
package Hashmap;

import java.util.*;

public class syntax {

      public static void fristsntax() {
            Map<String, Integer> mp = new HashMap<>();
            mp.put("Nav", 23);
            mp.put("Tap", 20);
            mp.put("COOL", 24);
            mp.put("Rool", 21);

            System.out.println(mp.get("Nav"));
            System.out.println(mp.get("Tap"));
            // mp.put("Nav", 30);
            System.out.println(mp.get("Rav"));
            System.out.println(mp.remove("Tap"));

            // cahecking if a key is in the hashmap

            System.out.println(mp.containsKey("Nav"));// flas
            System.out.println(mp.containsKey("Tap"));// True

            // jab new entry karni ho to tab ham
            mp.putIfAbsent("TOOL", 29);
            mp.putIfAbsent("Nav", 29);

            // get all the keys in the Hashmap
            System.out.println(mp.keySet());

            // get all the keys in the Hashmap method 2
            System.out.println(mp.values());
            // get all entry in the Hashmap
            System.out.println(mp.entrySet());

            // Traversing all entries of hashmap- multiple method
            for (String key : mp.keySet()) {
                  // Correct use of printf for formatted output
                  System.out.printf("Age of %s is %d%n", key, mp.get(key));
            }
            System.out.println(" ");

            // other why to travse the the key value

            for (Map.Entry<String, Integer> e : mp.entrySet()) {
                  System.out.printf("Age of %s is %d%n", e.getKey(), e.getValue());
            }

      }

      public static void main(String[] args) {
            fristsntax();
      }
}


package Hashmap;

import java.util.*;

public class Hashmapim {

      public static void maxfrequency() {
            int[] arr = { 1, 2, 5, 1, 4, 4, 6, 4, 4, 4, 6, 2, 2 };
            Map<Integer, Integer> fr = new HashMap<>();
            for (int el : arr) {
                  if (!fr.containsKey(el)) { 
                        fr.put(el, 1);
                  } else {
                        fr.put(el, fr.get(el) + 1);
                  }
            }

            System.out.println("Frequency MAp ");
            System.out.println(fr.entrySet());
            int mxfr = 0, anskey = -1;
            // for (var e : fr.entrySet()) {
            // if (e.getValue() > mxfr) {
            // mxfr = e.getValue();
            // anskey = e.getKey();
            // }
            // }

            for (var key : fr.keySet()) {
                  if (fr.get(key) > mxfr) {
                        mxfr = fr.get(key);
                        anskey = key;
                  }
            }
            System.out.printf("%d has a max freq and its occurs %d timmes", anskey, mxfr);

      }

      public static void main(String[] args) {
            maxfrequency();
      }
}


 
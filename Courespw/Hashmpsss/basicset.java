package Courespw.Hashmpsss;

import java.util.*;

public class basicset {

      public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<>();
            set.add(10);
            set.add(20);
            set.add(-5);
            System.out.println(set.size());
            set.add(44);
            System.out.println(set);
            set.remove(20);
            System.out.println(set);
            // cheack is vaue is hear or not
            System.out.println(set.contains(50));
      }

}

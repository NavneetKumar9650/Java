package ArrayListPW;

import java.util.ArrayList;

public class basicofArrylist {
      public static void main(String[] args) {
            ArrayList<Integer> st = new ArrayList<>();
            st.add(10); // Adds at index 0
            st.add(20); // Adds at index 1
            st.add(30); // Adds at index 2
            st.add(40); // Adds at index 3
            st.add(50); // Adds at index 4
            System.out.println(st);

            // Loop through the ArrayList and print each element
            for (int i = 0; i < st.size(); i++) {
                  System.out.println(st.get(i));
            }
            st.set(2, 300);// modify
            for (int i = 0; i < st.size(); i++) {
                  System.out.println(st.get(i));
            }
      }
}

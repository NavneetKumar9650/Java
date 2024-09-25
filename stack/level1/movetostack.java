package stack.level1;

import java.util.*;

public class movetostack {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Stack<Integer> st = new Stack<>();

            // Pushing elements onto the stack
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            System.out.println("Original Stack: " + st);

            // Reversing the stack
            Stack<Integer> rt = new Stack<>();
            while (st.size() > 0) {

                  rt.push(st.pop()); // Push it onto the reversed stack rt
            }
            System.out.println("Reversed Stack: " + rt);
      }
}

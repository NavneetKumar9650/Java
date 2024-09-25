import java.util.*;

public class RemoveConsecutive {

      public static int[] remove(int[] arr) {
            int n = arr.length;
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                  // Push to stack if stack is empty or top of stack is not equal to current
                  // element
                  if (st.isEmpty() || st.peek() != arr[i]) {
                        st.push(arr[i]);
                  } else {
                        // If current element is equal to the top of the stack, pop the stack
                        while (!st.isEmpty() && st.peek() == arr[i]) {
                              st.pop();
                        }
                  }
            }

            // Prepare the result array
            int[] res = new int[st.size()];
            int m = res.length;

            // Fill the result array from the stack
            for (int i = m - 1; i >= 0; i--) {
                  res[i] = st.pop();
            }
            return res;
      }

      public static void main(String[] args) {
            int[] arr = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
            int[] res = remove(arr);
            for (int i = 0; i < res.length; i++) {
                  System.out.print(res[i] + " ");
            }
      }
}
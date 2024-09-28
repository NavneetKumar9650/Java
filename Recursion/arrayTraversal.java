package Recursion;

public class arrayTraversal {

      public static void print(int i, int n) {
            if (i > n)
                  return;
            System.out.println(i + " ");
            print(i + 1, n);
      }

      public static void main(String[] args) {
            int[] arr = { 4, 7, 1, 3, 8, 6, 9, 3, 6 };
            print(1, 10);
      }
}

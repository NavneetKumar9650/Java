package Recursion;

import java.util.Arrays;

public class Sorting {

      static void triangle(int r, int c) {
            if (r == 0) {
                  return;
            }
            if (c < r) {
                  System.out.print("*"); // Print the star before the recursive call
                  triangle(r, c + 1);
            } else {
                  System.out.println();
                  triangle(r - 1, 0);
            }
      }

      static void bubble(int[] arr, int r, int c) {
            if (r == 0) {
                  return;
            }
            if (c < r - 1) {
                  if (arr[c] > arr[c + 1]) {
                        int temp = arr[c];
                        arr[c] = arr[c + 1];
                        arr[c + 1] = temp;
                  }
                  bubble(arr, r, c + 1);
            } else {
                  bubble(arr, r - 1, 0);
            }
      }

      public static void main(String[] args) {
            int[] arr = { 4, 3, 2, 1 };
            int r = arr.length;
            bubble(arr, r, 0);
            System.out.println(Arrays.toString(arr));
      }
}
package Parent;

import java.util.Arrays;

public class Bubble {

      public static void Bubbleshor(int[] arr) {
            boolean swapped;
            for (int i = 0; i < arr.length; i++) {
                  swapped = false;
                  // for each step , max item will come at the last respective
                  for (int j = 1; j < arr.length - i; j++) {
                        // swap if the
                        if (arr[j] < arr[j - 1]) {
                              int temp = arr[j];
                              arr[j] = arr[j - 1];
                              arr[j - 1] = temp;
                              swapped = true;
                        }
                  }

                  // if you did not swap for a paticular value of i
                  if (!swapped) {
                        break;
                  }
            }
      }

      public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                  int minIndex = i;
                  for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] < arr[minIndex]) {
                              minIndex = j;
                        }
                  }
                  swap(arr, i, minIndex);
            }
      }

      private static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
      }

      public static void InsertionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                  for (int j = i + 1; j > 0; j--) {
                        if (arr[j] < arr[j - 1]) {
                              swap(arr, j, j - 1);
                        } else {
                              break;
                        }
                  }
            }
      }

      public static void main(String[] args) {
            int[] arr = { 5, 4, 3, 2, 1 };
            InsertionSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
      }
}
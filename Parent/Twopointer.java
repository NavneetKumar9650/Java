package Parent;

import java.util.Scanner;

public class Twopointer {

      static void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();
      }

      static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
      }

      static void zeroAndOne(int[] arr) {
            int n = arr.length;
            int zeros = 0;
            // Count number of zeros
            for (int i = 0; i < n; i++) {
                  if (arr[i] == 0) {
                        zeros++;
                  }
            }

            for (int i = 0; i < n; i++) {
                  if (i < zeros) {
                        arr[i] = 0;
                  } else {
                        arr[i] = 1;
                  }
            }
      }

      static void sortZeroesAndOnes(int[] arr) {
            int n = arr.length;
            int left = 0, right = n - 1;
            while (left < right) {
                  if (arr[left] == 1 && arr[right] == 0) {
                        swap(arr, left, right);
                        left++;
                        right--;
                  }
                  if (arr[left] == 0) {
                        left++;
                  }
                  if (arr[right] == 1) {
                        right--;
                  }
            }
      }

      static void sortArrayByParity(int[] arr) {
            int n = arr.length;
            int left = 0;
            int right = n - 1;
            while (left < right) {
                  if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                        swap(arr, left, right);
                        left++;
                        right--;
                  }

                  if (arr[left] % 2 == 0) {
                        left++;
                  }
                  if (arr[right] % 2 == 1) {
                        right--;
                  }
            }
      }

      static int[] sortSquare(int[] arr) {
            int n = arr.length;
            int left = 0, right = n - 1;
            int[] ans = new int[n];
            int k = 0;

            while (left <= right) {
                  if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                        ans[k++] = arr[left] * arr[left];
                        left++;
                  } else {
                        ans[k++] = ans[right] * arr[right];
                        right--;
                  }

            }
            return ans;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            sc.close();

            System.out.println("Original array");
            printArray(arr);

            // sortArrayByParity(arr);
            int[] ans = sortSquare(arr);
            System.out.println("Sorted array");

            printArray(ans);
      }
}
package Parent;

import java.util.Scanner;

public class Binary {

      static int binarySearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;

                  if (target < arr[mid]) {
                        end = mid - 1;
                  } else if (target > arr[mid]) {
                        start = mid + 1;
                  } else {
                        return mid;
                  }
            }
            return -1;
      }

      public static int OrderAgnosticBS(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            boolean isAsc = arr[start] < arr[end];

            while (start <= end) {
                  int mid = start + (end - start) / 2;

                  if (arr[mid] == target) {
                        return mid;
                  }

                  if (isAsc) {
                        if (target < arr[mid]) {
                              end = mid - 1;
                        } else {
                              start = mid + 1;
                        }
                  } else {
                        if (target > arr[mid]) {
                              end = mid - 1;
                        } else {
                              start = mid + 1;
                        }
                  }
            }

            return -1;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = { 99, 89, 75, 22, 11, 10, 5, 2, -3 };
            System.out.println("Enter your target:");
            int target = sc.nextInt();
            int ans = OrderAgnosticBS(arr, target);
            System.out.println("Index of the target number: " + ans);
            // sc.close();
      }
}
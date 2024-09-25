package Parent;

import java.util.Arrays;

public class Questions {
      public static int lowerbound(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            // Sorting the array
            // Arrays.sort(arr);

            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (arr[mid] >= target) {
                        end = mid - 1;
                  } else {
                        start = mid + 1;
                  }
            }

            if (start < arr.length && arr[start] >= target) {
                  return start;
            } else {
                  return -1;
            }
      }

      public static int upperbound(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            int upperBound = -1; // Initialize upperBound to -1 in case target is greater than all elements

            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (arr[mid] <= target) {
                        start = mid + 1;
                  } else {
                        upperBound = mid; // Update upperBound if arr[mid] > target
                        end = mid - 1;
                  }
            }

            return upperBound;
      }

      public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 5 };
            int target = 3;
            int ans = lowerbound(arr, target);
            System.out.println(ans);
      }
}

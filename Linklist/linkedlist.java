package Linklist;

public class linkedlist {

      public static void alphaTriangle(int n) {
            // Write your code here
            for (int i = 0; i < n; i++) {

                  for (char ch = (char) ('C' - i); ch >= 'C'; ch++) {
                        System.out.print(ch + " ");
                  }

                  System.out.println();
            }
      }

      public int search(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                  int mid = start + (end - start) / 2;

                  if (nums[mid] == target) {
                        return mid;
                  }

                  // Determine which part is sorted
                  if (nums[start] <= nums[mid]) {
                        // Left part is sorted
                        if (nums[start] <= target && target < nums[mid]) {
                              end = mid - 1;
                        } else {
                              start = mid + 1;
                        }
                  } else {
                        // Right part is sorted
                        if (nums[mid] < target && target <= nums[end]) {
                              start = mid + 1;
                        } else {
                              end = mid - 1;
                        }
                  }
            }

            return -1; // Target not found
      }

      public static void main(String[] args) {
            linkedlist solution = new linkedlist();
            int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
            int target = 0;
            int result = solution.search(nums, target);
            System.out.println("Index of target " + target + " is: " + result);
      }
}
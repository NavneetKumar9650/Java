package Parent;

import Fristclass.student;

public class part {

      public static int binarySearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (arr[mid] > target) {
                        end = mid - 1;
                  } else if (arr[mid] < target) {
                        start = mid + 1;
                  } else {
                        return 1;
                  }
            }
            return -1;

      }

      public static int celingofnumber(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (arr[mid] > target) {
                        end = mid - 1;

                  } else if (arr[mid] < target) {
                        start = mid + 1;
                  } else {
                        return mid;
                  }
            }
            return start;
      }

      public static int flore(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (arr[mid] > target) {
                        end = mid + 1;
                  } else if (arr[mid] < target) {
                        start = mid + 1;
                  } else {
                        return mid;
                  }
            }
            return end;
      }

      public static int findlast(int[] arr, int target) {
            int[] ans = { -1, -1 };
            search(arr, target, true, ans);
            return ans[0];
      }

      public static void search(int[] nums, int target, boolean findStartIndex, int[] ans) {
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (nums[mid] > target) {
                        end = mid - 1;
                  } else if (nums[mid] < target) {
                        start = mid + 1;
                  } else {
                        ans[0] = mid;
                        if (findStartIndex) {
                              end = mid - 1;
                        } else {
                              start = mid + 1;
                        }
                  }
            }
      }

      public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
            int target = 8;
            int ans = findlast(arr, target);
            System.out.println(ans);
      }
}

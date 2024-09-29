package Parent;

import Fristclass.student;

public class Question {

      private static boolean findStartIndex;

      static int selingnumber(int[] arr, int target) {
            if (target > arr[arr.length - 1]) {
                  return -1;
            }

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
            return start;
      }

      public static int floteingnum(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (target < arr[mid]) {
                        end = mid - 1;
                  } else if (target > arr[mid]) {
                        start = mid - 1;
                  } else {
                        return mid;
                  }
            }
            return end;
      }

      public static char nextGreatestLetter(char[] letters, char target) {
            if (target >= letters[letters.length - 1]) {
                  return letters[0];
            }

            int start = 0;
            int end = letters.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;

                  if (target < letters[mid]) {
                        end = mid - 1;
                  } else {
                        start = mid + 1;
                  }
            }
            return letters[start % letters.length];
      }

      public static int searchRange(int[] nums, int target) {
            int ans = -1;

            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (target < nums[mid]) {
                        end = mid - 1;
                  } else if (target > nums[mid]) {
                        start = mid + 1;
                  } else {
                        ans = mid;
                        if (findStartIndex == true) {
                              end = mid - 1;
                        } else {
                              start = mid + 1;
                        }
                  }
            }
            return ans; // Return -1 if target element is not found
      }

      static int ans(int[] arr, int target) {
            int start = 0;
            int end = 1;
            while (target > arr[end]) {
                  int newStart = end + 1;
                  end = end + (end - start + 1) * 2;
                  start = newStart;
            }
            return -1;

      }

      public static int infiteArrya(int[] arr, int target, int start, int end) {
            // int start =0;
            // int end = arr.length-1;

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

      public static int peakIndexInMountainArry(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                  int mid = (start + end) / 2; // Correct calculation of mid index
                  if (arr[mid] > arr[mid + 1]) {
                        end = mid;
                  } else {
                        start = mid + 1;
                  }
            }
            return start;
      }

      // public static int pehleSearch(int[] arr, int target) {
      // int peak = search(arr);
      // int fristtry = Searchkarle(int[] arr, int target, int start, int end)
      // }

      // public static int search(int[] arr) {
      // int start = 0;
      // int end = arr.length - 1;

      // while (start < end) {
      // int mid = (start + end) / 2; // Correct calculation of mid index
      // if (arr[mid] > arr[mid + 1]) {
      // end = mid;
      // } else {
      // start = mid + 1;
      // }
      // }
      // return start;
      // }

      public static int Searchkarle(int[] arr, int target, int start, int end) {
            // int start =0;
            // int end = arr.length-1;

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

      public static void main(String[] args) {

            int[] arr = { 0, 2, 1, 0 };
            System.out.println("The output is: " + " " + peakIndexInMountainArry(arr)); // Call the method using the
                                                                                        // object
      }
}

// char[] letters = { 'c', 'f', 'j' };
// char target = 'c';
// char result = nextGreatestLetter(letters, target);
// System.out.println("Next greatest letter to " + target + " is " + result);

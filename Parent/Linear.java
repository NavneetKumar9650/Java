package Parent;

public class Linear {

      static int linearSearch(int[] arr, int target) {
            if (arr.length == 0) {
                  return -1;
            }

            for (int i = 0; i < arr.length; i++) {
                  int element = arr[i];
                  if (element == target) {
                        return i;
                  }
            }
            return -1;
      }

      static boolean searchString(String str, char target) {
            if (str.length() == 0) {
                  return false;
            }

            for (int i = 0; i < str.length(); i++) {
                  if (target == str.charAt(i)) {
                        return true;
                  }
            }
            return false;
      }

      static int searchRange(int[] arr, int target, int start, int end) {
            if (arr.length == 0) {
                  return -1;
            }
            for (int i = start; i <= end; i++) {
                  int element = arr[i];
                  if (element == target) {
                        return i;
                  }
            }
            return -1;
      }

      public static int ceillingno(int[] nums, int target) {
            if (target > nums[nums.length - 1]) {
                  return -1;
            }
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (nums[mid] == target) {
                        return mid;
                  } else if (target > nums[mid]) {
                        start = mid + 1;
                  } else {
                        end = mid - 1;
                  }
            }
            return start;
      }

      public char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (letters[mid] <= target) {
                        start = mid + 1;
                  } else {
                        end = mid - 1;
                  }
            }
            return letters[start % letters.length];
      }

      public static int[] searchRange(int[] nums, int target) {
            int[] ans = { -1, -1 };

            ans[0] = search(nums, target, true);
            if (ans[0] != -1) {
                  ans[1] = search(nums, target, false);
            }

            return ans;
      }

      private static int search(int[] nums, int target, boolean findStartIndex) {
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
                        if (findStartIndex) {
                              end = mid - 1;
                        } else {
                              start = mid + 1;
                        }
                  }
            }

            return ans;
      }

      static int ans(int[] arr, int target) {
            int start = 0;
            int end = 1;

            while (target > arr[end]) {
                  int newStart = end + 1;
                  end = end + (end - start + 1) * 2;
                  start = newStart;
            }
            return copybinarySearch(arr, target, start, end);
      }

      static int copybinarySearch(int[] nums, int target, int start, int end) {
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (target < nums[mid]) {
                        end = mid - 1;
                  } else if (target > nums[mid]) {
                        start = mid + 1;
                  } else {
                        return mid;
                  }
            }
            return -1;
      }

      public static int findPivot(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  // 4
                  if (mid < end && arr[mid] > arr[mid + 1]) {
                        return mid;
                  }
                  if (mid > start && arr[mid] < arr[mid - 1]) {
                        return mid - 1;
                  }
                  if (arr[mid] <= arr[mid - 1]) {
                        return mid - 1;
                  }
            }
      }

      public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                  int mid = start + (end - start) / 2;
                  if (arr[mid] > arr[mid + 1]) {
                        end = mid;
                  } else {
                        start = mid + 1;
                  }
            }
            return start;

      }

      public int findInMountainArray(int target, MountainArray mountainArr) {
            int peak = peakIndexInMountainArray(arr);
            int fristtry = binarySearcheee(arr, 0, peak);
            if (fristtry != -1) {
                  return fristtry;
            }
      }

      static int binarySearcheee(int[] arr, int target, int start, int end) {
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (target < arr[mid]) {
                        end = mid - 1;
                  } else {
                        return mid;
                  }
                  return -1;
            }
      }

      public static void main(String[] args) {
            int[] arr = { 5, 7, 7, 8, 8, 10 };
            int target = 8;
            // int[] result = searchRange(arr, target);

            // System.out.println("Start index: " + result[0]);
            // System.out.println("End index: " + result[1]);
      }
}

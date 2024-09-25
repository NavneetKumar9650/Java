package Recursion;

public class newcode {

      public static boolean sorted(int[] arr, int index) {
            if (index == arr.length - 1) {
                  return true;
            }

            return arr[index] < arr[index + 1] && sorted(arr, index + 1);
      }

      public static int lenear(int[] arr, int target, int index) {
            if (index == arr.length) {
                  return -1;
            }
            if (arr[index] == target) {
                  return index;
            } else {
                  return lenear(arr, target, index + 1);
            }

      }

      public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 5, 61, 8 };
            System.out.println(sorted(arr, 0));
      }
}

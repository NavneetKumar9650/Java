package ArrayListPW;

import java.util.Arrays;

public class copyofArrays {
      public static void main(String[] args) {
            int[] arr = { 30, 10, 40, 23, 56 };
            for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();
            int[] nums = arr; // shallow copy
            nums[0] = 70;
            System.out.print(arr[0]);
            int[] brr = Arrays.copyOf(arr, arr.length);
            for (int ele : brr) {
                  System.out.print(ele + " ");
            }
      }
}

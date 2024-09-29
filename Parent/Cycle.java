package Parent;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cycle {

      public static void sort(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                  int correct = arr[i] - 1;
                  if (arr[i] != arr[correct]) {
                        swap(arr, i, correct);
                  } else {
                        i++;
                  }

            }
      }

      public static void swap(int[] arr, int frist, int second) {
            int temp = arr[frist];
            arr[frist] = arr[second];
            arr[second] = temp;
      }

      public static void missingnumber(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                  int correct = arr[i] - 1;
                  if (arr[i] < arr.length && arr[i] != arr[i]) {
                        swap(arr, i, i);
                  } else {
                        i++;
                  }

            }
      }

      public static void Allindex(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                  int correct = nums[i] - 1;
                  if (nums[i] != nums[correct]) {
                        swap(nums, i, correct);
                  } else {
                        i++;
                  }
            }
                  List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index);
            }
        }

        // Print the result
        System.out.println("Displaced indices: " + ans);
    }

      }

      public static void main(String[] args) {
            int[] arr = { 1, 5, 4, 3, 2 };
            sort(arr);
            System.out.println(Arrays.toString(arr));
      }
}

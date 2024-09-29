package Parent;

import java.util.Scanner;

import Fristclass.student;

public class Duniya {

      public static int binarySearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length;
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

      public static void Bubbleshor(int[]arr){
            
      }

      public static int linearSearch(int[] arr, int target) {
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

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("wht is your target ");
            int[] arr = { 4, 5, 3, 6, 4 };
            int target = sc.nextInt();

            int ans = linearSearch(arr, target);
            System.out.println("The searching is a " + " " + ans);
      }
}

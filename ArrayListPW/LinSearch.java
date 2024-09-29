package ArrayListPW;

import java.util.Scanner;

public class LinSearch {

      public static void maxelem() {
            int[] arr = { 10, 25, 0, 420, 12, 5, 6, 4, 5, 7, 8, 45, 44 };
            int n = arr.length;
            int mx = arr[0];
            for (int i = 1; i < n; i++) {
                  if (arr[i] > mx)
                        mx = arr[i];
                  ;

            }
            System.out.println(mx);
      }

      public static void secondmaxelem() {
            int[] arr = { 10, 25, 0, 420, 12, 5, 6, 4, 5, 7, 8, 45, 44 };
            int n = arr.length;
            int mx = Integer.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                  // if (arr[i] > mx)
                  mx = Math.max(mx, arr[i]);
            }
            int smx = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                  if (arr[i] != mx) {
                        smx = Math.max(smx, arr[i]);
                  }
            }
            // System.out.println(mx);
            System.out.println(smx);
      }

      public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter target element");
            // int x = sc.nextInt();
            // System.out.println("Enter the size ");
            // int n = sc.nextInt();
            // int[] arr = new int[n];
            // System.out.println("Enter the Arrya element");
            // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
            // }

            // // soluction
            // boolean flag = false;
            // for (int i = 0; i < n; i++) {
            // if (arr[i] == x) {
            // flag = true;
            // break;
            // }
            // }
            // if (flag == true)
            // System.out.println("Element Found");
            // else
            // System.out.println("Element not found");
            maxelem();
            secondmaxelem();

      }
}

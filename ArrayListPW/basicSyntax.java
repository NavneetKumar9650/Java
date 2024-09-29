package ArrayListPW;

import java.util.*;

public class basicSyntax {
      public static void main(String[] args) {
            // taking a input of a arry
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5];
            for (int i = 0; i <= 4; i++) {
                  arr[i] = sc.nextInt();
            }
            for (int i = 0; i <= 4; i++) {
                  System.out.print(arr[i] + " ");
            }

      }
}

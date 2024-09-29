package Math;

import Stack.stack;

public class frist {
      public static void main(String[] args) {
            int[] arr = { 2, 3, 3, 4, 2, 6, 4 };
            System.out.println(ans(arr));
            magicnumber();
            Noofdights();
      }

      private static int ans(int[] arr) {

            int unique = 0;
            for (int n : arr) {
                  unique ^= n;
            }
            return unique;
      }

      public static void magicnumber() {
            int n = 6;
            int ans = 0;
            int base = 5;
            while (n > 0) {
                  int last = n & 1;
                  n = n >> 1;

                  ans += last * base;
                  base = base * 5;
            }
            System.out.println(ans);
      }

      public static void Noofdights() {
            int n = 10;
            int b = 2;

            int aas = (int) (Math.log(n) / Math.log(b)) + 1;

            System.out.println(aas);
      }
}

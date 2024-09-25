package Recursion;

public class Fibonachi {

      public static void fun(int n) {
            if (n == 0) {
                  return;
            }
            System.out.println(n);
            fun(n - 1);
      }

      public static void funrevers(int n) {
            if (n == 0) {
                  return;
            }

            funrevers(n - 1);
            System.out.println(n);
      }

      public static void funboth(int n) {
            if (n == 0) {
                  return;
            }
            System.out.println(n);
            funboth(n - 1);
            System.out.println(n);

      }

      public static int factorial(int n) {
            if (n == 0 || n == 1) {
                  return 1;
            }
            return n * factorial(n - 1);
      }

      public static void main(String[] args) {
            int ans = sumofnum(1342);
            System.out.println(ans);
      }
}

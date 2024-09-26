package Recurison;

import java.util.Scanner;

public class FunctionCall {

      public static int fact(int n) {
            if (n == 1)
                  return 1;
            int ans = n * fact(n - 1);
            return ans;
      }

      public static void print(int n) {
            if (n == 0)
                  return;
            System.out.println(n);
            print(n - 1);
      }

      public static void printinc(int n){
            
            System.out.println(n);
            print(n+1);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            print(n);
      }
}

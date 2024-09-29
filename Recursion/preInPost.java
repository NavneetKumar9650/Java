package Recursion;

import java.util.Scanner;

public class preInPost {

      public static void per(int n){
            if(n==0) return;
            System.out.print(n + " ");
            per(n-1);
            System.out.print(n + " ");
            per(n-1);
            System.out.print(n + " ");
      }

      public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // System.out.println("Enter the number");
      // int n = sc.nextInt();
      per(3);  // Just call per(3) without print
  }
}

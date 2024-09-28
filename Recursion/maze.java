package Recursion;

import java.util.Scanner;

public class maze {

      public static int mazepath(int row, int col, int m, int n){
             if(row==m|| col==n) return 1;
            // if(row==m && col==n) return 1;
            // if(row>m || col>n) return 0;
            int rightWays = mazepath(row, col+1, m,n);
            int downWays = mazepath(row+1, col, m,n);
            return rightWays+downWays;
      }
      public static int mazepath2( int m, int n){
            if(m==1|| n==1) return 1;
           // if(row==m && col==n) return 1;
           // if(row>m || col>n) return 0;
           int rightWays = mazepath2(m, n-1);
           int downWays = mazepath2(m-1,n);
           return rightWays+downWays;
     }
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int n = sc.nextInt();
      System.out.println("Enter the n");
      int m = sc.nextInt(); // Define m
      System.out.println("Enter the m");
      // System.out.println(mazepath(1,1, m , n));
      System.out.println(mazepath2(m, n));
  }
}

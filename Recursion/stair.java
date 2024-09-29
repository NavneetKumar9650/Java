package Recursion;

import java.util.Scanner;

public class stair {

public static int nthstair(int n){
      if(n<=2) return  n;
      return nthstair(n-1)+ nthstair(n-2);
}


      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int n = sc.nextInt();
      System.out.println(nthstair(n));
  }
}

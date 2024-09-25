package Parent;

public class pattern {

      public static int pyramid(int n) {
            int s = 1;
            int e = 0;
            for (int i = 0; i < n; i++) {

                  if (i % 2 == 0) {
                        s = 1;
                  } else {
                        s = 0;
                  }
                  for (int j = 0; j <= i; j++) {
                        System.out.print(s);
                        s = 1 - s;
                  }
                  System.out.println(e);

            }
            return n;
      }

      public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) {
                  return 0;
            }

            int mini = prices[0];
            int maxprofit = 0;
            for (int i = 1; i < prices.length; i++) { // Start from index 1 since mini is initialized to prices[0]
                  int cost = prices[i] - mini;
                  maxprofit = Math.max(maxprofit, cost);
                  mini = Math.min(mini, prices[i]);
            }
            return maxprofit;
      }

      public static void numberCrown(int n) {
            // Write your code here.
            for (int i = 1; i <= n; i++) {
                  // Print the left side numbers
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                  }

                  // Print the spaces
                  for (int j = 1; j <= 2 * (n - i); j++) {
                        System.out.print(" ");
                  }

                  // Print the right side numbers
                  for (int j = i; j >= 1; j--) {
                        System.out.print(j);
                  }

                  System.out.println();
            }

      }

      public static void nNumberTriangle(int n) {
            // Write your code here
            int num = 1;
            for (int i = 1; i <= n; i++) {

                  for (int j = 1; j <= i; j++) {
                        System.out.print(num);
                        num = num + 1;
                  }
                  System.out.println();
            }

      }

      public static void nLetterTriangle(int n) {
            // Write your code here

            for (int i = 0; i < n; i++) {
                  // space
                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                  }

                  char ch = 'A';
                  int breakpoint = (2 * i + 1) / 2;
                  for (int j = 1; j <= 2 * i + 1; j++) {
                        System.out.print(ch + " ");
                        if (j <= breakpoint) {
                              ch++;
                        } else {
                              ch--;
                        }
                  }

                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                  }
                  System.out.println();
            }
      }

      // public int[] plusOne(int[] digits) {
      // int to = digits.length - 1;
      // System.out.println(to + 1);
      // return digits;
      // }

      public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                  if (digits[i] < 9) {
                        digits[i]++;
                        return digits;
                  }
                  digits[i] = 0;
            }

            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
      }

      public static void main(String[] args) {

      }

}
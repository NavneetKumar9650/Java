package Project;

import java.util.Scanner;

public class Project {
      public static void main(String[] args) {
            ATM obj = new ATM();
            obj.checkpin();

      }
}

class ATM {
      float Bal = 0;
      int PIN = 5647;

      public void checkpin() {
            System.out.println("Enter your pin");
            Scanner sc = new Scanner(System.in);
            int enterpin = sc.nextInt();
            if (enterpin == PIN) {
                  menu();
            } else {
                  System.out.println("Enter a vailed pin");
            }
      }

      public void menu() {
            System.out.println("Check ballence");
            System.out.println("1. Cheack A/c Balance");
            System.out.println("2. withdraw money");
            System.out.println("3. Deposite Money");
            System.out.println("EXIT");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if (opt == 1) {
                  checkBlance();
            } else if (opt == 2) {
                  withdrawMony();
            } else if (opt == 3) {
                  DepositeMoney();
            } else if (opt == 4) {
                  return;
            } else {
                  System.out.println("Enter a valid choice");
            }

      }

      public void checkBlance() {
            System.out.println("Balance:" + Bal);
            menu();

      }

      public void withdrawMony() {
            System.out.println("Enter the amount to withdrow");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if (amount > Bal) {
                  System.out.println("Insufficient Balance");
            } else {
                  Bal = Bal - amount;
                  System.out.println("Money withdrow Successfuly");

            }
            menu();
      }

      public void DepositeMoney() {
            System.out.println("Enter the amount");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Bal = Bal + amount;
            System.out.println("Money Deposited Successfuly");
            menu();
      }

}

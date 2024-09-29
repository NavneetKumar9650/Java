package Aapnato;

import javax.security.auth.callback.PasswordCallback;

public class Friest {
      public static void main(String[] args) {
             Pen p1 = new Pen(); //n created  a pen obj called p1 
             p1.setColor("Blue");
             System.out.println(p1.getColor());
             p1.setTip(5);
             System.out.println(p1.getTip());
      }
}

class BankAccount {
       public String username;
       private  String password;

}

class Pen{
       private String color;    // ye qualty honi cahiye 
       private int tip;

      String getColor(){
            return this.color;

      }

      int getTip(){
            return this.tip;
      }

      void setColor(String newColor){     /// ye function 
            color = newColor;
      }

      void setTip(int Tip){
            this. tip = Tip;
      }

}

package Fristclass;
public class Inneritance {
      double l;
      double w;
      double h;

      Inneritance  () {
       this.h = -1;
       this.l = -1;
       this.w = -1;

      }

      //cbue
      Inneritance(double side){
            this.w = side;
            this.l = side;
            this.h = side;
     }

     Inneritance(double l , double h , double w ){
      this.l = l;
      this.w  = w;
      this.h = h;

     }
     Inneritance(Inneritance old){
      this.l =  old.l;
      this.w  = old.w;
      this.h =old. h;

     }
     public void information(){
      System.out.println("Running the box");
     }
     
}

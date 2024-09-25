package Fristclass;
public class Inneritan extends Inheritance {
      double weight;
  
      public Inneritan() {
          super(); // Explicitly call the superclass constructor
          this.weight = -1;
      }
  
      public Inneritan(double l, double h, double w, double weight) {
          super(l, w, h);
          this.weight = weight;
      }
  }
  
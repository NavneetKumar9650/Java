package Fristclass;
public class BoxPrice extends Inheritance {
      double cost;
  
      BoxPrice() {
          super();
          this.cost = -1;
      }
  
      BoxPrice(BoxPrice other) {
          super();
          this.cost = other.cost;
      }
  
      public BoxPrice(double l, double h, double w, double weight, double cost) {
          super(l, h, w );
          this.cost = cost;
      }
  }
  
package Aapnato;

public class Ingerit {
      public static void main(String[] args) {
      //      Fish shark = new Fish();
      //      shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
       
      System.out.println(dobby.legs);
      }
}
//Base class// praint claa
class Animal {
      String color;
      void eat(){
            System.out.println("eats");
      }

      void breathe(){
            System.out.println("Breathes");
      }
}

class Mammals extends Animal{
      int lage;
}

class Dog extends Mammals{

      public int legs;
      String breed;
}
//Derived class

// class Fish extends Animal{
//       int fins;

//       void swim(){
//             System.out.println("swin in water");
//       }
// }
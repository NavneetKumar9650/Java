package Fristclass;
public class second {
      int age;
      String name;
      int salary;
      boolean married;
       static long population;
  
      public second(int age, String name, int salary, boolean married) {
          this.age = age;
          this.name = name;
          this.salary = salary;
          this.married = married;
          second.population +=1;
      }
  }
  
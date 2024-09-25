package Aapnato;

import Fristclass.student;

public class Second2 {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Navneet";
    s1.roll = 456;
    s1.password = "asasa";
    s1.marks = new int[]{100, 90, 99}; // Initialize marks array
      
    Student s2 = new Student(s1);
    s2.password = "wwe";

    for (int i = 0; i < 3; i++) {
        System.out.println(s2.marks[i]);
    }
}
}


class Student{
      String name;
      int roll;
      String password;
        int marks[];
      

      Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
        

      }

       Student(  ){
           System.out.println("constructor is called");
      }
       Student(String name){
        marks = new int[3];
       this .name= name;
      }
      Student(int roll){
        marks = new int[3];
        this.roll = roll;
      }
}

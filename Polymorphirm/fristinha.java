package Polymorphirm;

public class fristinha {
      public static void main(String[] args) {
            Student.change();
            Student s1 = new Student(11, "Navneet");
            Student s2 = new Student(12, "Todo");
            Student s3 = new Student(655, "GO");
            Student s4 = new Student(45, "run");
            s1.display();
            s2.display();
            s3.display();
            s4.display();
      }
}

class Student {
      int rollno;
      String name;
      static String college = "AKG";

      Student(int r, String n) {
            rollno = r;
            name = n;
      }

      static void change() {
            college = "ITS";
      }

      void display() {
            System.out.println(rollno + " " + name + " " + college);
      }
}

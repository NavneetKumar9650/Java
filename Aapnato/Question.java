package Aapnato;

public class Question {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNumber = 85;
        student.schoolName = "wwe"; // Corrected the typo here
        System.out.println("Is it working: Roll Number - " + student.rollNumber + ", School Name - " + student.schoolName);
    }
}

class Person {
    String name;
    int weight;
}

class Student extends Person {
    int rollNumber;
    String schoolName;
}

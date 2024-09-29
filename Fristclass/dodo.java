package Fristclass;

public class dodo {
    public static void main(String[] args) {
        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        // // You can do more operations with the student object here

        // // Instantiate Student object and print it
        // Student nav = new Student();
        // nav.rno = 13;
        // nav.name = "Navneet";
        // nav.marks = 99.5f;

        // System.out.println(nav.rno);
        // System.out.println(nav.name);
        // System.out.println(nav.marks);

        // static class Student {
        // int rno;
        // String name;
        // float marks;

        // // Default constructor
        // Student() {
        // this.rno = 0;
        // this.name = "";
        // this.marks = 0.0f;
        // }

        // // Parameterized constructor
        // Student(int roll, String name, float marks) {
        // this.rno = roll;
        // this.name = name;
        // this.marks = marks;
        // }
        // }

        // private String name;
        // private float marks;
        // private int rno;

        // void greeting() {
        // System.out.println("Hello my name is " + this.name);
        // }

        // // Corrected constructors
        // dodo() {
        // this.rno = 13;
        // this.name = "kunal kushwaha";
        // this.marks = 88.5f;
        // }

        // dodo(int roll, String name, float marks) {
        // this.rno = roll;
        // this.name = name;
        // this.marks = marks;
        // }
        Overloding obj = new Overloding();

        obj.test();

        obj.test(5);

        obj.test(10, 20);

        double result = obj.test(2.5);
        System.out.println("Result of test(double): " + result);
    }
}

class Overloding {

    void test() {
        System.out.println("NO parameter");
    }

    void test(int a) {
        System.out.println("a" + a);
    }

    void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
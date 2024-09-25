package Aapnato;

import java.util.Scanner;

public class Package {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walk on 4 legs");
    }

    void eat() {
        System.out.println("Horse eats grass");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walk on 2 legs");
    }
}

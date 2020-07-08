package javaapplication2;

class A {

    int i;

    A(int x) {
        i = x;
        System.out.println("Constructor with args called ");
    }

    A() {
        i = 10;
        System.out.println("A class constructor called");
    }
}

class B extends A {

    int i;

    B() {
        super(100);
        i = 20;
        System.out.println("B class constructor called");
    }

    void add() {
        System.out.println(i + super.i);
    }
}

public class BaseClassConstWithParameter {

    public static void main(String[] args) {

        B ob = new B();
        ob.add();
    }
}

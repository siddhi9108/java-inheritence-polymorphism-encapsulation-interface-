package javaapplication2;

class S {

    int i;

    S() {
        i = 10;
        System.out.println("A class constructor called");
    }
}

class D extends S {

    int j;

    D() {

        j = 20;
        System.out.println("B class constructor called");
    }

    void add() {
        System.out.println(i + j);
    }
}

public class AddInINheritence {

    public static void main(String[] args) {

        D ob = new D();
        ob.add();
    }
}

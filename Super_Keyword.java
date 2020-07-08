package javaapplication2;

class C {

    int i;

    C() {
        i = 10;
        System.out.println("A class constructor called");
    }
}

class V extends C {

    int i;

    V() {

        i = 20;
        System.out.println("B class constructor called");
    }

    void add() {
        System.out.println(i + super.i);
    }
}

public class Super_Keyword {

    public static void main(String[] args) {

        V ob = new V();
        ob.add();
    }
}

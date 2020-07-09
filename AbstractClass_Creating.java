package javaapplication2;

abstract class X {

    void show() {
        System.out.println("In A");
    }

    abstract void add(int x, int y);
}

class Y extends X {

    @Override
    void add(int x, int y) {
        System.out.println(x + y);
    }
}

public class AbstractClass_Creating {

    public static void main(String[] args) {
        Y ob = new Y();
        ob.show();
        ob.add(100, 200);
    }
}

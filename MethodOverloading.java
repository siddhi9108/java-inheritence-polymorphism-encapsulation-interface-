package javaapplication2;

class K {

    void add(int x, int y) {
        System.out.println(x + y);
        System.out.println("Int add method called");
    }

    void add(double x, double y) {
        System.out.println(x + y);
        System.out.println("Double add method called");
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        K t1 = new K();
        t1.add(2.3, 4.7);
        t1.add(1, 3);

        int a;
        float b = (float) 5.5;
        String name = "Siddhi";
        System.out.println(name);

    }
}

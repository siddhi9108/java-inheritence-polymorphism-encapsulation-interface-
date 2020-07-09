package javaapplication2;

class H {

    void show() {

        System.out.println("In H Class ");
    }
}

class I extends H {

    void show() {

        System.out.println("In I Class");
    }
}

class J extends I {

    void show() {

        System.out.println("In J Class");
    }
}

public class RunTime_Poly2 {

    static void disp(H r) {
        r.show();
    }

    public static void main(String[] args) {
        H ob1 = new H();
        I ob2 = new I();
        J ob3 = new J();
        disp(ob1);
        disp(ob2);
        disp(ob3);

    }
}

package javaapplication2;

class L {

    void show() {

        System.out.println("In L Class ");
    }
}

class F extends L {

    void show() {

        System.out.println("In F Class");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        F ob = new F();
        ob.show();

    }
}

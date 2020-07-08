package javaapplication2;

class Q {

    void show() {
        System.out.println("In Base class ");
    }
}

class P extends Q {

    void disp() {
        System.out.println("In Derived class ");
    }
}

public class CreatingInheritence {

    public static void main(String[] args) {
        P ob = new P();
        ob.show();
        ob.disp();
    }

}

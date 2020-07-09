package javaapplication2;

class E {

    void show() {

        System.out.println("In L Class ");
    }
}

class G extends E {

    void show() {

        System.out.println("In F Class");
    }
}

public class RunTime_Poly {

    public static void main(String[] args) {
        G r;
        r = new G();
        r.show();

    }
}

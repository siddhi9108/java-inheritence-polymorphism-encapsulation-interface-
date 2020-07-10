package javaapplication2;

interface Info {

    int A = 10;
    static int B = 20;
    static final int C = 30;
    final int D = 40;

}

public class VarIn_Interface {

    public static void main(String[] args) {
        System.out.println(Info.A);
        System.out.println(Info.B);
        System.out.println(Info.C);
        System.out.println(Info.D);

    }
}

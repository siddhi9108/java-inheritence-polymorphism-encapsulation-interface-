package javaapplication2;

class R {

}

class T extends R {

}

public class NeedOfRunTime_Poly {

    public static void main(String[] args) {
        R ob1 = new R();
        T ob2 = new T();
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
    }
}

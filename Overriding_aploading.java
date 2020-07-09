package javaapplication2;

class U {

    @Override
    public String toString() {
        return " This is Object of A class";//To change body of generated methods, choose Tools | Templates.
    }

}

class W extends U {

    @Override
    public String toString() {
        return " This is Object of B class"; //To change body of generated methods, choose Tools | Templates.
    }

}

public class Overriding_aploading {

    public static void main(String[] args) {

        U ob1 = new U();
        W ob2 = new W();
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
    }
}

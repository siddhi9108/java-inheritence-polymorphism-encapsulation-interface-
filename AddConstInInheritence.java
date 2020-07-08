package javaapplication2;

class M {

    M() {
        System.out.println("In M");
    }

}

class N extends M {

    N() {
        System.out.println("In N");
    }

}

class O extends N {

    O() {
        System.out.println("In O");
    }

}

public class AddConstInInheritence {

    public static void main(String[] args) {
        O ob = new O();

    }

}

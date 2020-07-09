package javaapplication2;

abstract class Account {

    void getCustInfo() {
        System.out.println("Get cust info");
    }

    abstract void calculateInterest();
}

class Savings extends Account {

    @Override
    void calculateInterest() {
        System.out.println("calculate interest of saving acc");
    }
}

class Current extends Account {

    @Override
    void calculateInterest() {
        System.out.println("calculate interest of current acc");
    }
}

public class AbstractClass_AccountEx {

    public static void main(String[] args) {
        Savings ob = new Savings();
        ob.getCustInfo();
        ob.calculateInterest();

        Current ob1 = new Current();
        ob1.getCustInfo();
        ob1.calculateInterest();
    }
}

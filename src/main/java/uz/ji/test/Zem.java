package uz.ji.test;

public class Zem {
     final void m1() {
        System.out.println("One");
    }
}

class Test1 extends Zem {
    private String s = "hello";
    static String h = "hi";
    void m2() {
        System.out.println("Two");
    }


    public static final void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println("test1.s = " + test1.s);


    }
}


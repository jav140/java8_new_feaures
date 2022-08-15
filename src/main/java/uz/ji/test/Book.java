package uz.ji.test;

public class Book {

    public static void sum(int a, Integer b){
        System.out.println(a+b);
    }

    public static Integer sum(Integer a, int b){
        return a+b;
    }


    public static void main(String[] args) {

        main(4);
    }

    public static void main(Integer a) {
        System.out.println("a = " + a);
    }
}

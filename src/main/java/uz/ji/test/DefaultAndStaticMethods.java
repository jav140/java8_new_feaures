package uz.ji.test;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class DefaultAndStaticMethods {
    public static void main(String[] args) throws CloneNotSupportedException {

//        MyClass myClass = new MyClass();
//        System.out.println("myClass.log(\"Otabek\") = " + myClass.log("Otabek"));
//        myClass.method1();
//        System.out.println(Interface1.log_2("hello"));

//        Zyoma zyoma = new Zyoma("Shohruh bro",19);
//        Object clone = zyoma.clone();
//        System.out.println(zyoma);
//        System.out.println("clone = " + clone);





    }

}

class MyClass implements Interface1{

    @Override
    public void method1() {
        System.out.println("this is method 1");
    }

    @Override
    public String log(String str) {
        return Interface1.super.log(str);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

@FunctionalInterface
interface Interface1{

     void method1();

    default String log(String str){
        return " hello " + str;
    }

//    @NotNull
//    @Contract(pure = true)
    static String log_2(String str){
        return " hello log_2 " + str;
    }


}

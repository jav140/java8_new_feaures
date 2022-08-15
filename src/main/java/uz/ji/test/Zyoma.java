package uz.ji.test;

public class Zyoma{
    private String name;
    private int age;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Zyoma(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

package uz.ji.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
//
//        Iterator<Integer> iterator = myList.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        List<String> names = Arrays.asList("John", "Freddy", "Samuel");
        names.forEach(name -> System.out.println("Hello, " + name));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        // method reference
        numbers.forEach(System.out::println);

        // TRAVERSING WITH FOR EACH
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        MyConsumer myConsumer = new MyConsumer();
        myList.forEach(myConsumer);

    }
}

class MyConsumer implements Consumer<Integer>{
    @Override
    public Consumer<Integer> andThen(Consumer<? super Integer> after) {
        return Consumer.super.andThen(after);
    }

    @Override
    public void accept(Integer integer) {
        System.out.println("integer = " + integer);
    }
}
package uz.ji.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkOnStream {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Mark", "Stive", "John");
        List<String> s1 = stringList.stream().filter(s -> s.startsWith("S")).toList();
        Collection<String> collectionList = stringList.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        s1.forEach(System.out::println);
        collectionList.forEach(System.out::println);

//        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        Iterator<Integer> iterator = integers.iterator();
//        iterator.forEachRemaining(System.out::println);

//        List<Integer> integerList = new ArrayList<>();
//        Stream<Integer> stream = integers.stream();
//        Stream<Integer> integerStream = integers.parallelStream();
//
//        stream.filter(integer -> integer>3).forEach(System.out::println);
//        integerStream.filter(integer -> integer>3).forEach(System.out::println);

//        stream.dropWhile(integer -> integer<3).forEach(System.out::println);
//        integerStream.dropWhile(integer -> integer<3).forEach(System.out::println);


//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        String format = now.format(DateTimeFormatter.ofPattern("d.MM.uuuu"));
//        System.out.println(format);
//        String format1 = now.format(DateTimeFormatter.ofPattern("MM.uuuu"));
//        System.out.println(format1);
//
//        LocalTime time = LocalTime.now();
//        String format2 = time.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
//        System.out.println(format2);





    }
}

package uz.ji.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/index"));

        StringBuilder builder = new StringBuilder();

        Stream<String> lines = reader.lines();

        lines.forEach(System.out::println);

        String line;

        while ((line = reader.readLine()) != null ){
            builder.append(line);
            builder.append(System.lineSeparator());

        }

        System.out.println(builder.toString());

    }
}

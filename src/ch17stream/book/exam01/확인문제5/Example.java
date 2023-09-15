package ch17stream.book.exam01.확인문제5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );

        //대소문자 상관없이 java가 포함되면 출력시키기
        System.out.println("contains 사용");
        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);

        System.out.println("matches사용");
        list.stream()
                .filter(s -> s.toLowerCase().matches(".*java*."))
                .forEach(System.out::println);

        System.out.println("indexOf 사용");
        list.stream()
                .filter(s -> s.toUpperCase().indexOf("JAVA") != -1)
                .forEach(System.out::println);

        System.out.println("고전적인 for 사용");
        for (String item : list) {
            if (item.toLowerCase().matches(".*java.*")) {
                System.out.println(item);
            }
        }
    }
}
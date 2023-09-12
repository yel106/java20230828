package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C02stream {
    public static void main(String[] args) {
        List<String> list = List.of("ab", "de", "xy");
        Stream<String> stream = list.stream();
        Stream<String> stream1 = stream.map(e -> e + e);
        long count = stream.count();

        list.stream()
                .map( e -> e+e) //중간연산
                .filter(e -> e.length() > 1) //중간연산
                .count(); //최종연산

    }
}

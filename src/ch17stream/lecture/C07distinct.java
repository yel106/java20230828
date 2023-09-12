package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C07distinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 7, 2, 1, 3, 6);
        long count = list.stream()
                .distinct() //중복 제거
                .count();

        System.out.println(count);
    }
}

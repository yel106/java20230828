package ch17stream.lecture;

import java.util.List;

public class C08sorted {
    public static void main(String[] args) {
        var list = List.of(3, 1, 3, 4, 5, 10, 11, 0);  //List<Integer>대신 var로 받을 수 있음
        list.stream()
                .sorted() //작은 수부터 순서대로 정렬
                .forEach(System.out::println);

    }
}

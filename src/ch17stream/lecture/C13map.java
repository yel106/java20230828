package ch17stream.lecture;

import java.util.List;

public class C13map {
    public static void main(String[] args) {
        //map: 원래 원소를 받아서 다른걸로 wrapping하고 싶을떄
        var list = List.of(3, 1, 2, 5, 7);

        list.stream()
                .map(x -> 10) // 3, 1, 2, 5, 7가 다 10이 됨
                .forEach(System.out::println);

        System.out.println("음수로 바꿔서 출력" );
        list.stream()
                .map(x -> -x)
                .forEach(System.out::println);

        System.out.println("두배한 값으로 출력");
        list.stream()
                .map(x-> x*2)
                .forEach(System.out::println);

        System.out.println("제곱값 출력");
        list.stream()
                .map( x-> x*x)
                .forEach(System.out::println);


    }
}

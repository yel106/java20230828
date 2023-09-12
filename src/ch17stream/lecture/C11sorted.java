package ch17stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {
        var list = List.of(10, 35, 1, 8, 5, 6, 9);

        System.out.println("가장 큰 값 출력");
        list.stream()
                .sorted((x,y) ->  y-x )  //왼쪽이 크면 양수, 오른쪽이 크면 음수
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 작은 값 출력");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);

    }
}

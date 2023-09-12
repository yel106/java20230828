package ch17stream.lecture;

import java.util.List;

public class C09limit {
    public static void main(String[] args) {
        var list = List.of(3, 9, 10, 11, 1, 0, -3);
        list.stream()
                .limit(2)  //몇개까지 자를지 maxSize를 쓰면됨
                .forEach(System.out::println);

        System.out.println("-------");
        System.out.println("가장 작은값 3개 출력");
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-------");

        System.out.println("앞에 3개를 정렬해서 출력"); //중간연산 쓸 떈 의도대로 잘 써야함
        list.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}

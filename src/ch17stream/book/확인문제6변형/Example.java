package ch17stream.book.확인문제6변형;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        System.out.println("나이들만 출력");
        list.stream()
                .map(x -> x.getAge())
                .forEach(System.out::println);

        //아니면 map말고 forEach로 x.getAge써도 됨

        System.out.println("나이들의 합 reduce로 구해서 출력");
        Integer sum= list.stream()
                .map(x -> x.getAge())
                .reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println("가장 많은 나이 reduce로 구해서 출력");
        Integer max = list.stream()
                        .map(x -> x.getAge())
                                .reduce(Integer.MIN_VALUE, Integer::max); //가장 적은 수를 초기값으로 줌
        System.out.println("가장 많은나이: " + max);

        System.out.println("가장 작은 나이 reduce로 구해서 출력");
        Integer min = list.stream()
                .map(x -> x.getAge())
                .reduce(Integer.MAX_VALUE, Integer::min);

        System.out.println("가장 적은 나이: " + min);


    }
}

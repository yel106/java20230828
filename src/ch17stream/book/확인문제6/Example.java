package ch17stream.book.확인문제6;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
            new Member("홍길동", 30),
            new Member("신용권", 40),
            new Member("김자바", 26)
        );

        //나이 평균 구하기
        double Double = list.stream()
                .mapToInt(Member::getAge) // Member 클래스에서 age의 getter를 가져올수 있음
                .average()
                .getAsDouble();
        System.out.println("평균나이 = " + Double);




    }
}

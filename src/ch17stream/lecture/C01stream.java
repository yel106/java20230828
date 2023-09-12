package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C01stream {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "react"); //읽기전용
        for (String item: list) {
            System.out.println("item = " + item);
        }

        //stream
        Stream<String> stream = list.stream();

        //메소드
        //중간연산: intermediate operation, 중간에 여러번 사용가능
        //최종연산: terminal operation 은 마지막에 한번만 사용 가능.
        // 최종연산 할 때 중간 연산을 같이 처리

        //최종 연산 후 stream 재사용 불가

        stream.limit(5); //중간연산
        stream.count(); //최종연산





    }
}

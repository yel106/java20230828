package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03stream {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring");
        Stream<String> stream = list.stream();

        stream.count(); //최종연산이 끝난 stream을 재사용 할 수 없음

        //stream.count(); //exception, 최종연산 후에 또 연산하려고 하니까 안됨

        //연산 다시 하려면 새로운 스트림 만들어서 해야함
        Stream<String> stream2 = list.stream();
        stream2.count();
        System.out.println("프로그램 실행중...");


    }
}

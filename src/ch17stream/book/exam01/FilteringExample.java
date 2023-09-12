package ch17stream.book.exam01;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<String > list = new ArrayList<>();
        list.add("홍길동");    list.add("신용권");
        list.add("김자바");    list.add("신용권");    list.add("신민철");

//        var list = List.of("홍길동", "신용권"); //이런식으로 써도 됨

        //중복 요소 제거 .distinct()
        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        //신으로 시작하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("신"))    //String의 startWiteh( ) 메소드는 주어진 문자열로 시작하면 true, 아니면 false리턴
                .forEach(n -> System.out.println(n));
        System.out.println();

        //중복된 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));



    }
}

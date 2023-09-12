package ch17stream.lecture;

import java.util.List;

public class C21reference {
    public static void main(String[] args) {
        List<String> list1 = List.of("java", "spring", "css");
        Integer length = list1.stream()
                .map(String::length)//맵을 통해서 참조타입 인티저로 바꿈.
                .reduce(Integer::sum)
                .get();
        System.out.println("length = " + length);


        //참조타입 stream -> 기본타입 stream
        //api 참조하기
        int sum = list1.stream()
                .mapToInt(String::length) // 기본타입 int로 받음
                .sum();
        System.out.println("sum = " + sum);



    }
}

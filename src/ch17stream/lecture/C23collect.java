package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;
//Collector에 Alt + Enter 치고 add~~ 누르면 import되면서 아래코드는 간단해짐



public class C23collect {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html");

        //고전적인 방법
        List<Integer> res1 = new ArrayList<>();
        for (String s :
                list) {
            res1.add(s.length());
        }
        System.out.println("res1 = " + res1);

        //collect를 이용하면 더 간단함
        List<Integer> res2 = list.stream()
                .map(String::length)
                .collect(toList());//collect는 최종연산임 . 콜렉트의 메소드는 콜렉터즈에 모여있음
                //toList는 스트림의 요소를 컬렉션(list)으로 수집(collect)하는 데 사용됨.
                //스트림 연산을 통해 처리한 데이터를 컬렉션에 저장하거나 반환하는 데 유용
        System.out.println("res2 = " + res2);

        //set으로 받고 싶다면?
        Set<Integer> res3 = list.stream()
                .map(String::length)
                .collect(toSet());//set은 중복된 값이 저장되지 않음, 순서도 보장 X
        System.out.println("res3 = " + res3);


        Map<String, Integer> collect = list.stream()  //파라미터 타입을 보고 String, Integer을 유추해서 알아서 써줌
                .collect(toMap(x -> x, String::length));//toMap은 key-value 를 쌍으로 받음. 스트림의 요소를 맵에 매핑할때 사용
        System.out.println("collect = " + collect);

        Map<String, Integer> collect1 = list.stream()
                .collect(toMap(identity(), String::length));
        // 위에 쓴 x -> x와 Function.identity()는 같은 의미
        System.out.println("collect1 = " + collect1);


    }
}
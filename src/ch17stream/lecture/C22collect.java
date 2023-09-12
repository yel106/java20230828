package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C22collect {
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
                .collect(Collectors.toList());//collect는 최종연산임 . 콜렉트의 메소드는 콜렉터즈에 모여있음
        System.out.println("res2 = " + res2);

        //set으로 받고 싶다면?
        Set<Integer> res3 = list.stream()
                .map(String::length)
                .collect(Collectors.toSet());//set은 중복된 값이 저장되지 않음, 순서도 보장 X
        System.out.println("res3 = " + res3);





        Map<String, Integer> collect = list.stream()  //파라미터 타입을 보고 String, Integer을 유추해서 알아서 써줌
                .collect(Collectors.toMap(x -> x, String::length));//toMap은 key를 쌍으로 받음 
        System.out.println("collect = " + collect);

        Map<String, Integer> collect1 = list.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        // 위에 쓴 x -> x와 Function.identity()는 같은 의미
        System.out.println("collect1 = " + collect1);



    }
}

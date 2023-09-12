package ch17stream.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class C25grouping {
    public static void main(String[] args) {
        List<String> list = List.of(
                "java",
                "spring",
                "css",
                "html" ,
                "react",
                "vue",
                "jquery",
                "jsp");

        Map<Integer, List<String>> collect = list.stream()
                .collect(groupingBy(String::length));//엘리먼트가 들어가면 숫자가 나오게. 그룹에 따라 묶임

        collect.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));


        Map<Integer, Long> map = list.stream()
                .collect(groupingBy(String::length, counting()));//Integer타입, Long타입을 반환
        //문자3개짜리가 몇개인지 그룹핑하는 것
        map.entrySet()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue() + "개"));




    }
}

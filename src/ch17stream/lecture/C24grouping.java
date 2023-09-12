package ch17stream.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C24grouping {
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
                .collect(Collectors.groupingBy(String::length));//엘리먼트가 들어가면 숫자가 나오게. 그룹에 따라 묶임

        collect.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));


    }
}

package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("kangin");
        set.add("min");

        set.forEach(System.out::println);  //set은 순서대로 안나옴
        System.out.println("시간이 흐른후");
       set.forEach(System.out::println);
    }
}

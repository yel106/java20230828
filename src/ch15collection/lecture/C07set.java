package ch15collection.lecture;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class C07set {
    public static void main(String[] args) {
        //Set: 객체(item, element, 원소, 요소)를 담고 있는 객체
        //특징: 중복된 element를 저장하지 않음.

//    Set set1 = new Set<>(); //set은 인터페이스라서(api참고) 객체를 바로 구현할 수 없음

        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("spring");
        set1.add("react");
        set1.add("java");

        //size: 원소의 갯수
        System.out.println(set1.size()); //3 중복은 허용하지 않음

        //contains: 있는지 확인하기
        System.out.println(set1.contains("java")); //Object equals 메소드 씀
        System.out.println(set1.contains("html"));

        //remove: 삭제
        boolean remove1 = set1.remove("java");
        boolean remove2 = set1.remove("html");

        System.out.println("remove1 = " + remove1); //있는걸 삭제하려고 했으니까 true
        System.out.println("remove2 = " + remove2); //없는걸 삭제하려고 해서 false

        System.out.println(set1.size());

        //of: 새로운 수정불가 set 객체 만듦
        Set<String> set2 = Set.of("css", "react", "html");
//        set2.add("java"); //exception뜸
        System.out.println("---------------");

        //전체 탐색 하는 방법. 인덱스가 없음
        //향상된 for문
        for (String str : set2) {
            System.out.println(str); //쓴 순서대로 안나옴 . 순서보장 X
        }
        System.out.println("---------------");

        //forEach
//        set2.forEach(item -> System.out.println(item));
        set2.forEach(System.out::println); //위랑 아래랑 같음
    }






}

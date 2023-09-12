package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        //Map: Key, Value 쌍(entry)를 저장
        //Key가 중복된 entry가 있을 수없음

        Map<String, String> map= new HashMap<>(); //map은 인터페이스라 구현하는 클래스를 이용해야함. 별일 없으면 HashMap사용

        // put: entry 추가 메소드
        map.put("student1", "손흥민");
        map.put("student2", "이강인");
        map.put("student3", "김민재");

        //entry의 갯수 확인
        System.out.println("size: " + map.size());

        //entry를 교체하는 메소드
        map.put("Student3", "박지성");

        //remove entry를 삭제하는 메소드
        map.remove("Student2");   //remove(Key) 도 있고, remove(Key, value)도 있음

        //get: entry의 value를 얻는 메소드
        String s= map.get("student1");
        System.out.println("s = " + s);
        System.out.println("map.get(\"student3\") = " + map.get("student3"));
        System.out.println("map.get(\"student2\") = " + map.get("student2"));




    }
}

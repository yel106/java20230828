package ch15collection.book.exam04;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<Member> set = new HashSet<>();


        //Member 객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        //인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장
        //Alt + insert로 equals & hashcode 재정의함

        //저장된 객체 수 출력
        System.out.println("총 객체 수: " + set.size());

    }
}

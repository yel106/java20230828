package ch15collection.book.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        //객체 추가
        set.add("java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        //객체를 하나씩 가져와서 처리
        //iteraetor 순서대로 탐색
        Iterator<String> iterator = set.iterator();
        String next= iterator.next();
        System.out.println(next);

        String next1= iterator.next();
        System.out.println(next1);

        String next2= iterator.next();
        System.out.println(next2);

        String next3= iterator.next();
        System.out.println(next3);

        //윗 문장을 반복문(while문)으로 변경
        while(iterator.hasNext()) {
            //객체를 하나 가져오기
            String element = iterator.next(); //.next( ) 탐색할 것을 가져와라
            System.out.println( element);
            if(element.equals("JSP")) {
                //가져온 객체를 컬렉션에서 제거
                iterator.remove();
            }
        }
        System.out.println("-----------------");

        // 반복문 말고 향상된 for문으로 써도 됨
        for (String element :
                set) {
            System.out.println(element);

        }


        //객체 제거
        set.remove("JDBC");

        //객체를 하나씩 가져와서 처리
        for (String element :
                set) {
            System.out.println(element);
        }

    }
}

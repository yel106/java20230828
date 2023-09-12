package ch15collection.book.확인문제8;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(1,"홍길동"));
        set.add(new Student(2,"신용권"));
        set.add(new Student(1,"조민우"));


        //equals & Hashcode 재정의 할 떄  name만 하면됨
        System.out.println("저장된 객체수: " + set.size());
        for (Student s: set) {
            System.out.println(s.studentNum + ":"+ s.name);
        }

    }
}

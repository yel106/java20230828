package ch12api.lecture;

import java.util.HashSet;
public class C10set {
    public static void main(String[] args) {
        // set: 집합
        HashSet set = new HashSet();
        set.add(new Object());
        set.add(new Object());

        System.out.println(set.size()); //두개의 객체를 넣으면 크기가 2나옴

        set.add(new String("java"));

        System.out.println(set.size());

        set.add(new String("java"));
        System.out.println(set.size());


    }
}

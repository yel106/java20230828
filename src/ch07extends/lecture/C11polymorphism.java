package ch07extends.lecture;

import ch07extends.book.exercise.p08.SnowTire;

import java.sql.SQLOutput;

public class C11polymorphism {
    public static void main(String[] args) {
        String s = "java";
        Object o = s; //스트링이 오브젝트인건 가능, 오브젝트가 스트링인건 불가능
        String t = new String("java");


//        String t = o; //이건 안됨

        int v1 = s.hashCode();
        int v2=  o.hashCode();
        int v3 = t.hashCode();

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(o));
        System.out.println(System.identityHashCode(t));
    }
}

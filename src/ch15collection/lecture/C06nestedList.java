package ch15collection.lecture;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class C06nestedList {
    public static void main(String[] args) {
        //2차원 배열
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();



        row1.add(9);
        row1.add(7);
        row1.add(5);

        row2.add(10);
        row2.add(20);


        list.add(row1);
        list.add(row2);
        System.out.println("---------");



        System.out.println("list.get(0).get(0) = " + list.get(0).get(0));
        System.out.println("list.get(0).get(1) = " + list.get(0).get(1));
        System.out.println("list.get(0).get(2) = " + list.get(0).get(2));

        System.out.println("list.get(1).get(0) = " + list.get(1).get(0));
        System.out.println("list.get(1).get(1) = " + list.get(1).get(1));

        list.add(row1);

        System.out.println();

        System.out.println("list.get(2).get(0) = " + list.get(2).get(0) );
        System.out.println("list.get(2).get(1) = " + list.get(2).get(1) );
        System.out.println("list.get(2).get(2) = " + list.get(2).get(2) );


        //값 교체 set 메소드
        list.get(0).set(0, 99); //0을 99로 바꿈
        System.out.println("list.get(0).get(0) = " + list.get(0).get(0));
        System.out.println("list.get(2).get(0) = " + list.get(2).get(0)); // 9에서 99로 바뀜
        //                99,   7, 5
        //                10, 20
        //                99   7   5
        System.out.println(row1);
        System.out.println(row2);


    }
}

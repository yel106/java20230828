package ch17stream.lecture;

import java.util.List;

public class C15reduce {
    public static void main(String[] args) {
        //reduce
        // ...........-> * 하나가 됨
        var list = List.of(5, 1, 3 );
        Integer reduce = list.stream()
                .reduce(0, (r, e) -> 0);//초기값, 직전리듀스값과 현재 엘리먼트를 받아서

//        apply(0, 5);
//        apply(0, 1);
//        apply(0, 3);

        // [5, 1, 3]
        System.out.println("모든 값 더하기");


        list.stream()
                .reduce(0, (r,e)-> r+e);
        System.out.println(reduce);

//        apply(0, 5);
//        apply(5, 1);
//        apply(6, 3);
        System.out.println("최대값 구하기");
        Integer reduce2 = list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("reduce2 = " + reduce2);

        System.out.println("최소값 구하기");
        Integer reduce3= list.stream()
                .reduce(Integer.MAX_VALUE,Math::max);
        System.out.println("reduce3 = " + reduce3);


        //문자열 연결하기
        var list2 = List.of("ja", "va", "is", "g", "ood");
        System.out.println("for문으로 문자열 연결");
        String res1= "";
        for (String e:list2 ) {
            res1 += e;
        }
        System.out.println(res1);

        System.out.println("stream으로 문자열 연결");
        list2.stream()
                .reduce("",String::concat); // 콘캣 메소드
        System.out.println("res1 = " + res1);



    }
}

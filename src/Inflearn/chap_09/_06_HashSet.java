package inflearn.chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //Set : list와 다르게 중복 허용X, 순서보장 X
        //셋을 이용하면 자동으로 중복이 제거되기때문에 신경쓰지 않아도 됨
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 :" + set.size());

        //순회
        for (String s : set) {
            System.out.println(s);
            //삼겹살 3번 넣었는데 1번만 나옴(중복 허용X)
            //삼겹살 먼저 넣었는데 소금이 먼저 나옴( 순서 보장X)
        }
        System.out.println("---------------");

        //확인
        if( set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("---------------");

        //삭제
        System.out.println("총 구매 상품 수 (삼겹살 구매 전 ) :" + set.size()); //7
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후 ) :" + set.size()); //6
        System.out.println("---------------");

        //전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수: " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("---------------");

        //세트: 중복허용 X, 순서 보장 X
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (int i : intSet) {
            System.out.println(i); //1, 13, 2 순서대로 넣었는데 출력은 1, 2, 13순서로 나옴
        }
        System.out.println("---------------");


        //set을 써야되는데 순서를 보장하고 싶다면? LinkedHashSet을 쓰면 됨
        HashSet<Integer> intSet1 = new LinkedHashSet<>();
        intSet1.add(1);
        intSet1.add(13);
        intSet1.add(2);

        for (int i : intSet1) {
            System.out.println(i);
        }










    }
}

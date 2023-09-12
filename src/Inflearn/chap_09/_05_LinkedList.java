package inflearn.chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        //데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("----------------");

        //추가
        list.addFirst("서장훈");
        for (String str :
                list) {
            System.out.println(str);
        }
        System.out.println("----------------");

        list.addLast("송지효");
        for (String str :
                list) {
            System.out.println(str);
        }
        System.out.println("----------------");

        System.out.println("학생 추가 전 : " + list.get(1));
        list.add(1, "김영철"); //1에 김영철을 추가해서 원래 1에있던 유재석은 2로 밀려남
        System.out.println("학생 추가 후 : " + list.get(1));
        System.out.println("학생 추가 후 : " + list.get(2));
        System.out.println("----------------");


        //삭제
        System.out.println("남은 학생 수 ( 제외 전) : " + list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수 ( 제외 후) : " + list.size());
        System.out.println("----------------");

        //처음 학생과 마지막 학생이 전학
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        list.removeFirst(); //처음 데이터 삭제
        list.removeLast(); //마지막 데이터 삭제
        System.out.println("남은 학생 수 (전학 후) : " + list.size());
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("----------------");

        //변경 (수강권 양도)
        list.set(0, "이수근");
        System.out.println(list.get(0));

        //확인
        System.out.println(list.indexOf("김종국"));
        if(list.contains("김종국")) {
            System.out.println("수강신청 성공");
        } else {
            System.out.println("수강신청 실패");
        }

        //전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
        }
        System.out.println("----------------");

        //새로운 학기
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");   //list는 중복 데이터 허용
        list.add("강호동");
        list.add("강호동");

        //정렬
        Collections.sort(list);
        for (String str : list) {
            System.out.println(str);
        }









    }

}

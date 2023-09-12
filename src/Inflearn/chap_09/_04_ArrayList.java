package inflearn.chap_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _04_ArrayList {
    public static void main(String[] args) {
        //컬렉션 프레임워크: 원하는 만큼 데이터를 추가, 삭제 가능. 컬렉션 내 데이터가 포함되어있는지 탐색, 정렬 등 다양한 기능
        // List, Set, Map 이 있음
        // List는 ArrayList, LinkedList가 있음

        //배열은 크기를 정하면 수정하기 쉽지 않음
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        ArrayList<String> list = new ArrayList<>();

        //데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회( 인덱스 기준)
        System.out.println(list.get(0)); //유재석
        System.out.println(list.get(1)); //조세호
        System.out.println(list.get(2)); //김종국
        System.out.println(list.get(3)); //박명수
        System.out.println(list.get(4)); //강호동

        System.out.println("------------------------");

        //삭제 (박명수씨가 이사 감)
        System.out.println("신청 학생 수 ( 이사 전) : " + list.size()); //size는 데이터의 갯수를 알 수 있음
        list.remove("박명수"); //"인덱스 또는 "이름" 입력
        System.out.println("신청 학생 수 ( 이사 후) : " + list.size()); //size는 데이터의 갯수를 알 수 있음
        System.out.println(list.get(3)); //박명수가 빠져서 4였던 강호동이 3인덱스가 됨
        System.out.println("------------------------");

        System.out.println("남은 학생수(제외 전) : " + list.size());
        list.remove(list.size() - 1);
        // 총 4개의 데이터가 있는데 인덱스는 0부터니까 list.size() - 1을 하면 맨 마지막 데이터가 지워짐. 강호동 삭제
        System.out.println("남은 학생수(제외 후) : " + list.size());
        System.out.println("------------------------");

        //순회
        for ( String str: list) {
            System.out.println(str);

        }
        System.out.println("------------------------");

        //변경 (수강권 양도)
        System.out.println("수강권 양도 전: "+list.get(0));
        list.set(0, "이수근"); //set(바꿀 데이터 인덱스, 이름)
        System.out.println("수강권 양도 후: " + list.get(0));
        System.out.println("------------------------");

        //확인
        System.out.println(list.indexOf("김종국")); //찾으려는 데이터가 몇번째 인덱스인지 확인하기

        //선착순 5명 내에 포함되었는가? true or false로 반환됨
        if ( list.contains("김종국")) {          //if문 속에 쓰면 true라서 아래 코드가 실행됨
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }
        System.out.println("------------------------");

        //전체 삭제
        list.clear();
        //리스트가 지워졌는지 확인
        if(list.isEmpty()) {
            System.out.println("학생 수: " + list.size());
        }
        System.out.println("------------------------");

        //다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //'가나다' 순으로 정렬
        Collections.sort(list);  // Collections.sort() 메소드에 정렬하고 싶은 데이터를 넣으면 됨
        for (String str :
                list) {
            System.out.println(str);
        }




    }
}

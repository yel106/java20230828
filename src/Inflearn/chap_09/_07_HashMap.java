package inflearn.chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
//    맵 (Key, Value)
//    키로 사물함을 열수 있는데 그 사물함을 열수있는 열쇠는 하나여야함
//     그렇지 않으면 사람들이 함부로 내 사물함을 열수 있음
//     Key값을 통해서 Value를 저장하고, Value를 가져오는 작업에 용이한게 map임
//
//    만약 카페에 핸드폰 번호를 적으면 포인트를 적립해주는 곳이 있다고 할 떄
//     핸드폰 번호를 key값으로 삼아 거기에 매칭되는 포인트 데이터를 관리하는 것.
    public static void main(String[] args) {
        HashMap<String , Integer > map = new HashMap<>();
        // <K, V> 어떤값을 key로 하고 어떤값을 V로 넣을지 정할 수 있음

        //list, set은 추가할떄 .add썼는데 map은 .put을 씀
        //데이터 추가
        map.put("유재석", 10); //유재석이라는 열쇠로 열수있는 값에는 10이라는 숫자가 들어있음
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("총 고객 수 " + map.size());
        System.out.println("----------------");

        //조회
        System.out.println("유재석님의 포인트: " + map.get("유재석")); //get에는 key값을 써야 value가 옴
        System.out.println("유재석님의 포인트: " + map.get("유재석")); //get에는 key값을 써야 value가 옴
        System.out.println("----------------");

        //확인
        if ( map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);    //만약 서장훈이 있었다면 원래 point에 ++해서 점수를 더해주는것
            System.out.println("서장훈님의 누적 포인트: " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 ( 포인트 1)");
        }
        System.out.println("---------------------------");

        //삭제
        map.remove("유재석");
        System.out.println(map.get("유재석")); //null값이 뜸
        System.out.println("---------------------------");

        //전체 삭제
        map.clear();
        if(map.isEmpty()) {
            System.out.println("남은 고객 수: " + map.size());
            System.out.println("폐업해야 하나...?");
        }
        System.out.println("---------------------------");

        //다시 고객들이 찾아옴
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        //Key 확인. Hashmap도 순서보장 X
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("----------------");

        //Value 확인
        for (int value : map.values()) {
            System.out.println(value);
        }

        //map은 순서보장이 되지 않기 때문에 Key/ Value 함께 확인해야하는 경우가 있음
        for (String key : map.keySet()) {
            System.out.println("고객이름: " + key + "\t포인트: " + map.get(key));
        }

        System.out.println("----------------");
        
        //맵: 중복X, 순서 X
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);
        for (String key : map.keySet()) {
            System.out.println("고객이름: " + key + "\t포인트: " + map.get(key));
        }
        //김종국을 3번 넣었는데 최종적으로 업데이트 했던 "김종국", 50 하나만 출력됨

        //맵을 쓰는데 순서를 보장하고 싶다면? LinkedHashMap이용
        HashMap<String , Integer > map1 = new LinkedHashMap<>();












    }
}

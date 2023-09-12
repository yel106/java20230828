package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13map {
    public static void main(String[] args) {
        //map 전체 탐색
        Map<String, String > map = new HashMap<>();
        map.put("학생1", "흥민");
        map.put("학생2", "강인");
        map.put("학생3", "민재");

        //향상된 for
        System.out.println("향상된 for로 전체탐색"); //map도 순서보장 안 됨
        Set<Map.Entry<String, String>> entries =   map.entrySet();
        for(Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
        // keySet. map에서 키들만 얻어옴
        System.out.println("keySet 사용해서 전체탐색");
        Set<String> keys = map.keySet();//Alt + enter해서 introducen loval variable하면 됨
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

        //forEach
        System.out.println("forEach 메소드로 전체탐색 ");

        //익명클래스로 한것 . Alt + enter치면 람다식으로 바뀜
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }


    }
}

package ch15collection.book.exam05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);    //홍길동이 2개. key가 같기 때문에 제일 마지막에 저장한 값만 저장
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수: "+ map.size());
        System.out.println();

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key); //key를 매개값으로 주면 값을 리턴
        System.out.println(key + ":" + value);
        System.out.println();

        //key Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator(); //키를 반복하기 위해 반복자를 얻음
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k+ ":" + v);

        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ":" + v);
        }

        //향상된 for문
        for (Map.Entry<String, Integer> entry: map.entrySet() ) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //foreach
        map.forEach((k, v) -> System.out.println(k + ":" + v) );



        System.out.println();

        //키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 = " + map.size());
        System.out.println();
    }
}


package ch15collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C10removeIf {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("jsp");
        set.add("spring");

        //람다식으로 쓰면? 코드를 줄일 수 있음
        set.removeIf(e -> e.equals("css"));

        /*
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if(item.equals("css")) {
                iterator.remove(); //탐색하면서 remove 함
            }
        }
        */

        System.out.println(set); //jsp는 지워짐






    }
}

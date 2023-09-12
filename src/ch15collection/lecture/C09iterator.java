package ch15collection.lecture;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C09iterator {
    //iterator 잘 사용하진 않음

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("spring");
        set.add("css");

        /*
        for (String elem : set) {
            //반복문 사용중 collection의 아이템 삭제 시 ,
            // exception발생 할 수 있음
            //Java라고 썼따가 css로 변경하려고 하면 exception발생
            System.out.println("elem = " + elem);
            if( elem.equals("css")) {  //java에서 css로 변경
                set.remove("css");
            }
        }
       */

        //foreach말고 이터레이터를 사용
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("item= " + item);
            iterator.remove();
        }
//        System.out.println("set.size( )")+ set.size();


    }
}

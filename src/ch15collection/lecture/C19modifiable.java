package ch15collection.lecture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class C19modifiable {
    public static void main(String[] args) {

        List<String> list1 = List.of("html", "css", "react", "js");

        List<String > list2 = new ArrayList<>(list1);//list1에 있는것을 list2에 넣어줘야함

        //list2.add 써서 list1에 있는 것을 수정 하면 됨
        list2.add("java"); //수정할수 없다고 뜸. 수정하고 싶다면? 새 arrayList만들기

        System.out.println(list1.size());
        System.out.println(list2.size());



    }
}

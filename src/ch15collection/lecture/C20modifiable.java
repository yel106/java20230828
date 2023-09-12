package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C20modifiable {
    public static void main(String[] args) {
        //set도 수정하려면 새로운 Set만들어서 수정하면 됨
        Set<String> set = Set.of("java", "spring", "react");
        Set<String> set2 = new HashSet<>(set);

        set2.add("html");

        System.out.println(set.size());
        System.out.println(set2.size());

    }
}

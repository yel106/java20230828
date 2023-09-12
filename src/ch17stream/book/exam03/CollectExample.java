package ch17stream.book.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        /*
        //남학생만 묶어 List 생성
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .collect(Collectors.toList());     //Collectors.toList()를 바로 쓸 수도 있음
                //스트림의 tolist는 변경 불가, collector의 tolist는 변경이 될수도 안될수도 있음
        */

        List<Student> maleList = totalList.stream()
                .filter(s-> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s-> System.out.println(s.getName()));
        System.out.println();

        //학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
        Map<String, Integer> map = totalList.stream()
                .collect(Collectors.toMap(
                        s -> s.getName(),
                        s -> s.getScore()
                        )
                );
        System.out.println(map);
    }
}

package ch16lambda.lecture;

import java.util.stream.IntStream;

public class C12constructorReference {
    public static void main(String[] args) {
        //고전적인 for문 방법
        for( int i=1; i<10; i++) {
            Student s = new Student(i);
            System.out.println(s);
        }

        //Stream사용
        IntStream.range(1, 10)
//                .mapToObj(Student::new)
                .mapToObj(number -> new Student(number)) //각 요소 number를 Student클래스의 생성자를 호출하여
                // Student객체로 변환함.
                //mapToObj: 스트림의 각 요소를 다른 형태로 매핑하고 새로운 객체로 변환할 때 사용
                .forEach(System.out::println);


    }
}

class Student {
    private int number;

    Student(int number) {
        this.number = number;
    }


    //알트 + insert > toString메소드
    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                '}';
    }
}
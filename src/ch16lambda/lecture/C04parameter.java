package ch16lambda.lecture;

import java.util.Arrays;
import java.util.List;

public class C04parameter {
    public static void main(String[] args) {
        MyInterface04 o1 = (int x) -> {};
        MyInterface04 o2 = (x) -> {};
        MyInterface04 o3 = x -> {}; // 파라미터가 하나면 () 생략 가능

        List<String> list = List.of("java", "spring", "css", "html");
        list.forEach(e -> System.out.println(e));

        int[] arr = {10, 20, 40, 100, 200, 300};
        Arrays.stream(arr).forEach(e -> System.out.println(e)); //각 요소를 e라는 변수에 대입하고 그 값을 화면에 출력하는 동작
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);// 클래스 - 메소드. 오른쪽에 있는 메소드를 쓰겠다는 뜻


    }
}

interface MyInterface04 {
    void method(int x);
}

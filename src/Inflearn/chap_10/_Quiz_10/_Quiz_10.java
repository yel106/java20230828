package inflearn.chap_10._Quiz_10;
//힌트 :map()이용해서 가공
//삼항연산자(int max=a>b? a:b;


import ch07extends.lecture.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class _Quiz_10 {
    public static void main(String[] args) {



//        HashMap<String, Integer> entrance = new LinkedHashMap<>();
//        entrance.put("챈들러", 50);
//        entrance.put("레이첼", 42);
//        entrance.put("모니카", 21);
//        entrance.put("벤자민", 18);
//        entrance.put("제임스", 5);

        //ArrayList 사용
        //<>안에 Integer나 String  외에도 객체를 쓸 수 있음
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("챈들러", 50));
        list.add(new Customer("레이첼", 42));
        list.add(new Customer("모니카", 21));
        list.add(new Customer("벤자민", 18));
        list.add(new Customer("제임스", 5));

        //map을 쓰면 원하는 데이터를 가져올 수 있음. 삼항연산자도 이용. forEach는 순회하면서 출력함.
        System.out.println("미술관 입장료");
        System.out.println("---------------");
        list.stream().map(x -> x.age >=20? x.name + " 입장료 5000원" : x.name + " 입장료 무료")
                .forEach(System.out::println);

    }
}


//손님 이름, 나이정보
//입장료는 1인당 5000원
//20세이상에게만 입장료 부과
class Customer {
    public String name;
    public int age;



    public Customer(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Customer() {

    }
}

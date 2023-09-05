package inflearn.chap_09;

import inflearn.chap_09.coffee.Coffee;
import inflearn.chap_09.coffee.CoffeeByName;
import inflearn.chap_09.coffee.CoffeeByNickname;
import inflearn.chap_09.coffee.CoffeeByNumber;

public class _02_GenericClass {
    public static void main(String[] args) {
        //제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();


        System.out.println("---------------");

        CoffeeByName c3 = new CoffeeByName(34); //object니까 34를 넣어도 상관없음
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("--------------");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객번호:" + c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객이름:" + c4Name);
        System.out.println("---------------");

        //사용할 데이터타입을 <>안에 래퍼클래스로 써줌(정수형이면 int가 아니라 Integer)
        Coffee<Integer> c5 = new Coffee<>(35);
        //만약 35대신 "조세호"라고 뜬다면 에러발생. 실수를 줄일 수 있음
        c5.ready();
        int c5Name = c5.name; //Integer로 쓴다고 했기 때문에 따로 형변환 없이 int타입의 변수에 대입할 수 있음
        System.out.println("주문 고객 번호: " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름: " + c6Name);


    }
}

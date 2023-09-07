package inflearn.ch_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
//        //아래와 같이 쓰면 배열의 장점이 없음
        String [] coffees= {"아메리카노", "카페모카" , "라떼", "카푸치노" };
//        System.out.println(coffees[0] + "하나");
//        System.out.println(coffees[1] + "하나");


        //for 반복문 순회
        for(int i=0; i< 4; i++) {
            System.out.println(coffees[i] +"하나");
        }
        System.out.println("주세요");
        System.out.println("----------------");


        //배열의 길이를 이용한 순회  length가 배열의 길이를 알려줌
        for(int i=0; i< coffees.length; i++) {
            System.out.println(coffees[i] +"하나");
        }
        System.out.println("주세요");
        System.out.println("----------------");

//        enhanced for (= for-each) 반복문 : 배열이나 list에서 유용하게 쓰임
//         for ( 배열과 똑같은 데이터타입 변수명 : 순회할 배열명)
//         coffee라는 배열에 있는 값들을 순회하는데 그떄그떄 순회되는 값을 coffee라는 이름으로 받아서 사용하겠다.
        for (String coffee : coffees ) {
            System.out.println(coffee + "하나");
        }
    }
}

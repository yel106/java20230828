package Inflean.chap_10;

import Inflean.chap_10.Converter.*;


//Convert 패키지의 인터페이스랑 같이 보기

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(2);

//        convertUSD(public void convert(int USD) {
//            //1달러 = 1400원
//            System.out.println(USD + "달러 = " + (USD * 1400)+ "원");
//        }, 2); //메소드 호출
        //convertUSD(convert, int USD) 는
        // convert 메소드를 불러온거나 마찬가지. 이때 간결함을 위해 람다식을 사용

        //위의 식을 람다식으로 변경
        //convertUSD(USD -> System.out.println(USD + "달러 = " + (USD * 1400) + "원"), 2);

        //인터페이스 객체로 만들어 보기

        Convertible convertible = (USD)-> System.out.println(USD + "달러 = " + (USD * 1400) + "원");
        //위의 Convertible을 함수형 인터페이스라고 함
        //함수: 클래스 밖에서 기능을 하는것, 메소드: 클래스 안에서 기능을 하는것
        //인터페이스의 추상메소드는 1개이상 있으면 안됨 . 1:1로 매칭되기 떄문
        //2개면 어떤건지 알수 없음

        convertUSD(convertible, 1); //마치 변수처럼 사용함

        //전달값이 하나도 없다면? ( ) 아무것도 안넣으면됨
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러 = 1400원");
        c1.convert();

        //두 줄 이상 코드가 있다면? 중괄호가 있어야함
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD * 1400) + "원");
        };
        c1.convert();

        //전달값이 2개인 경우?
        ConvertibleWithToParams c2 = (USD, KRW) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원");
        c2.convert(10, 1400);

        //반환값이 있는 경우?             //return이 들어갔기 떄문에 한줄이라도 중괄호필요
        //return아예 없애버려도 상관은 없음
        ConvertibleWithReturn c3 = (USD, KRW) -> { return USD * KRW;};
        int result = c3.convert(20, 1400); //ctrl + alt + v 하면 앞에 데이터타입 int가 자동완성됨
        System.out.println("20달러 = " + result + "원");


    }




    //새로운 메소드 만들어서 출력하기
    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}

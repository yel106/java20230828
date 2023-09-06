package ch12api.book.exam05;

public class BoxingUnBoxingExamle {
    public static void main(String[] args) {
        //Boxing
        Integer obj = 100;
        System.out.println("value:" + obj.intValue()); //intValue()메소드는 Integer객체 내부의 int값을 리턴한다.

        //unboxing
        int value = obj;
        System.out.println("value:" + value);

        //연산시 Unboxing
        int result = obj + 100; //obj가 참조타입, 100이 기본타입 . 참조가 자동으로 언박싱 돼서 기본이랑 참조 +연산되는것
        System.out.println("result: " + result);
    }
}

package Inflean.chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        //람다식
        // (parameter1, param2, ... ) -> { 코드 }


    }

//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }

    //위 식이 아래처럼 변함
    //람다식은 접근제어자 필요없어서 public 삭제,
    //메소드명도 알기 때문에 삭제, 반환값도 있다면 자동으로 주어지니까 삭제
//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }

    //문자열을 전달값으로 받아서 처리하는 메소드
//    public void print(String s) {
//        System.out.println(s);
//    }

    //한 문장일떈 중괄호 없애고, 세미콜론도 없앨수 있음
    //전달되는 데이터타입도 알수있기때문에 String 삭제
    //전달값 한개면 ( ) 괄호도 없앨수 있음
//    s -> System.out.println(s)


//    public int add(int x, int y) {
//        return x + y;
//    }

    //위의 내용을 람다식으로 변경
    //return이 포함되는 경우엔 중괄호 생략 못함
    //return을 없애면 중괄호 생략가능
//    ( x, y) -> x + y

}

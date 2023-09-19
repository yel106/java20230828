package ch18io.lecture;

public class C26printf {
    public static void main(String[] args) {
        // %s : 문자열 출력
        System.out.printf("문자열:%s%n" , "java" ); // java가 %s에 들어감
        System.out.printf("문자열1:%s%n", "css", "react" ); //%s의 자리에는 첫번쨰인 css가 들어감
        System.out.printf("문자열1:%s%n문자열2:%s%n", "css", "react" ); //%s의 자리에는 첫번쨰인 css가 들어감

        // %d: 정수 십진법 출력
        System.out.printf("정수: %d%n", 99);
        System.out.printf("정수1:%d%n정수2:%d%n", 100, 200 );
//        System.out.printf("정수3:%d%n", "java"); //conversion을 잘못쓰면 에러가 남

        // argument_index$ 를 쓰면 2$ argument라는 뜻. 이걸쓰면 conversion을  순서대로 쓰지 않아도 됨
        System.out.printf("정수2: %2$d%n정수1:%1$%n", 100, 200); //퍼센트랑 컨버젼 사이에 아규먼트 인덱스가 들어감
        System.out.printf("정수:%1$d%n", 9, 8); //9
        System.out.printf("정수:%2$d%n", 9, 8); //8


    }
}

package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        //lambda
        //(파라미터 목록) -> {메소드 몸통}    ////파라미터 없으니까 ( ) 로 남기면 됨
        MyInterface02 o1 = new MyInterface02() {
            @Override
            public void method() {
                System.out.println("C02lambda.method");
            }
        };
        o1.method();

        MyInterface02 o2 = () -> System.out.println("메소드내 코드가 한줄이면 중괄호도 생략가능");
        o2.method();

        MyInterface02 o3 = ( ( ) -> System.out.println("C02lambda.main") );


    }


    @FunctionalInterface
    interface MyInterface02 {
        //파라미터 없는 메소드
        //리턴없음
        void method();

    }
}

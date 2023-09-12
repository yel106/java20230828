package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        try {

        } catch (NullPointerException e) {
            // 예외처리코드
        } catch (ArithmeticException e) {
            //예외처리코드
        }




        try {
            // NullPointerException
            // ArithmeticException
        } catch(RuntimeException e) {  //API보면 Throwable 까지 가능. Object는 안됨
            //여러 exception의 상위 타입으로 한번에 잡을 수 있음

            //동일한 예외처리코드
            // NullPointerException
            // ArithmeticException 둘다 RuntimeException에서 처리 가능함

        }

    }
}

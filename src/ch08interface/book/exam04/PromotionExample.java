package ch08interface.book.exam04;

public class PromotionExample {
    public static void main(String[] args) {
        //부모 클래스가 인터페이스를 구현하고 있다면 자식 클래스도 인터페이스 타입으로 자동 타입 변환 될 수 있음

        //구현 객체 생성
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        //인터페이스 변수 선언
        A a;

        //변수에 구현 객체 대입
        a= b;   // A<-- B (자동 타입 변환)
        a=c;    // A<-- C (자동 타입 변환)
        a =d;   // A<-- D (자동 타입 변환)
        a= e;   // A<-- E (자동 타입 변환)

    }
}

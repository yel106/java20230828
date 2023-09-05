package ch09nested.book.exam03;

public class A {
    //인스턴스 멤버 클래스
    static class B {} //A안에서 쓰려고 만듦


    //내부에서 쓸떄는 평소처럼 쓰면됨
    //인스턴스 필드 값으로 B 객체 대입
    B field1 = new B();

    //정적 필드 값으로 B객체 대입
    static B field2 = new B();

    //생성자
    A() {
        B b = new B();
    }

    //인스턴스 메소드
    void method1() {
        B b = new B();
    }

    //정적 메소드
    static void method2() {
        B b = new B();
    }
}

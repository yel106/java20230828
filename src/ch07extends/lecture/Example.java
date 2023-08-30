package ch07extends.lecture;


// 확인 문제 8번. 06클래스 파트 제일 뒷쪽 문제
public class Example {
    public static void action(A a) { //B b나 C c로 받을수는 없음. 어떤 타입의 인스턴스가 오냐랑 상관없이 실행가능
        a.method1();

        if ( a instanceof  C c) { //a가 c의 인스턴스라면 c객체의 method2메소드를 실행해라 .
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}

package ch07extends.book.sec07.exam01;

class A {

}

class B extends A {

}
class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;  //자동 타입변환(상속관계에 있음) . 실제 인스턴스인 B(); 로 가게됨 . b와 a1은 같은 참조값을 가짐
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

//        B b3 = e;  //컴파일 에러 (상속관계에 있지 않음)
//        C c2 = d;   //컴파일 에러 (상속관계에 있지 않음)

    }
}



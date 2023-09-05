package ch09nested.lecture;

//익명클래스는 인터페이스에서도 사용, 익명클래스에서 추상메소드는 꼭 재정의 해야함
public class C11interface {
    public static void main(String[] args) {
//        MyInterface11 o1 = new MyInterface11();
        MyInterface11 o2 = new MyClass111();
        MyInterface11 o3 = new MyInterface11() {
        };
    }
}


class MyClass111 implements MyInterface11 {}

interface MyInterface11 {

}


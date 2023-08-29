package ch07extends.lecture;

public class C07super {
    public static void main(String[] args) {
        MySubClass071 o1 = new MySubClass071();
        o1.method1();
    }
}

class MyClass07 {
    void method1() {
        System.out.println("부모 클래스 메소드 기능");
    }

}

//자식 클래스
class MySubClass071 extends MyClass07 {
    @Override
    void method1() {

            super.method1(); //자식클래스에서 부모클래스의 메소드 호출하고 싶을때 씀. 기존내용 플러스 다른내용 오버라이드 하고 싶을때.
//            System.out.println("부모 클래스 메소드 기능");
            System.out.println("자식 클래스의 재정의한 메소드");
    }
}

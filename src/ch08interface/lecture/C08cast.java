package ch08interface.lecture;

public class C08cast {
    public static void main(String[] args) {
        MyInterface08 i1 = new MyClass081(); //2개의 인스턴스가 있지만 참조변수는 i1이니까
        i1.method1();

//        i1.otherMethod(); //실행불가능 하려면 타입변경필요
    MyClass081 o1 = (MyClass081) i1;
    o1.otherMethod();
    }


}
interface  MyInterface08 {
    void method1();
}

class MyClass081 implements MyInterface08 {
    @Override
    public void method1() {
        System.out.println("재정의한 메소드");
    }

    public void otherMethod() {
        System.out.println("MyClass081.otherMethod");
    }
}


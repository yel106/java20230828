package ch07extends.lecture;

public class C05override {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        o1.method1(); //부모의 설계도에 의해 만들어져서 "어떤기능" 이라고 나옴

        MySubClass051 o2 = new MySubClass051();
        o2.method1(); //재정의 했기 때문에 "변경된기능" 이라고 나옴
        o2.method2(); //새로만든 메소드



    }
}

class MyClass05 {
    public void method1() {
        System.out.println("어떤 기능");
    }
}

class MySubClass051 extends MyClass05 {

    //메소드 오버라이드(메소드를 재정의). 부모와 메소드 이름은 같은데 안에 있는 내용만 다름 .
    public void method1() {
        System.out.println("변경된 기능");
    }

    public void method2() {
        System.out.println("추가된 기능");
    }
}
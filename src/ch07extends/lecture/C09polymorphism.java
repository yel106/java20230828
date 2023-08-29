package ch07extends.lecture;

import org.w3c.dom.ls.LSOutput;

public class C09polymorphism {
    public static void main(String[] args) {
        MySubClass091 o1 = new MySubClass091();
        MyClass09 o2 = o1; // o1의 참조값이 MyClass09의 o2참조값으로 들어감. 상위클래스에만 넣을수 있고 밑에껀 안됨.

        MyClass09 o3 = new MyClass09();
//    MySubCLass091 o4 = o3; //이건 안됨. 부모객체인 o3가 더  작은 범위인 자식 쪽에 들어가는건 안됨.
//    String o3 = o1; //이건 안됨
//    MyClass08 o4 = o1; //이건 안됨

        System.out.println(System.identityHashCode(o1));

        System.out.println(System.identityHashCode(o2));
        System.out.println(System.identityHashCode(o3));

        o1.method1(); //변수의 타입과 관계없이 실제 인스턴스의 메소드가 실행
        System.out.println("--------");
        o2.method1(); //o2는 부모클래스의 객체. 실제 인스턴스의 메소드 실행. new MySubClass091(); 자식 클래스의 인스턴스에 있기 때문에 윗줄과 똑같이 나옴.
        System.out.println("--------");
        o3.method1();
    }


}

class MyClass09 {
    void method1() {
        System.out.println("부모 메소드");

    }

}

class MySubClass091 extends MyClass09 {
    @Override
    void method1() {
        System.out.println("자식 메소드");
        super.method1();
    }
}
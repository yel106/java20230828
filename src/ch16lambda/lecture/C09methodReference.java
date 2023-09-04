package ch16lambda.lecture;

import ch07extends.book.sec08.exam06.package1.MyClass;

public class C09methodReference {
    public static void main(String[] args) {
        MyInterface09 o1 = (x,y)-> {};

        MyClass09 o2 = new MyClass09();

        MyInterface09 o3 = (x,y) -> x.someMethod(y);
        MyInterface09 o4 = MyClass09::someMethod; //위의 코드가 아래처럼 줄어듦
    }
}

class MyClass09 {
    void someMethod(int a) {

    }
}

interface MyInterface09 {
    void method(MyClass09 x, int y); //마이클래스 09를 x로 받고, int a를 int y가 받음
}

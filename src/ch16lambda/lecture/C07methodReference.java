package ch16lambda.lecture;

import ch07extends.book.sec08.exam06.package1.MyClass;

public class C07methodReference {
    public static void main(String[] args) {
        MyInterface07 o1 = (x, y) -> MyClass07.otherMethod(x,y); //x,y 파라미터로 다른 메소드에서 그냥 받기만 하는거라면  아래코드와 같이 더 줄일수 있음
        MyInterface07 o2 = MyClass07::otherMethod; //static 메소드는 바로 MyCLass07이라고 쓸수 있음

    }
}

class MyClass07 {
    static void otherMethod(int x, int y) {

    }
}

interface  MyInterface07{
    void method(int x, int y);

}

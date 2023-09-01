package ch08interface.lecture;

public class C15excercise {
    MyInterface15 field;

    public static void main(String[] args) {
        C15excercise o1 = new C15excercise();
        //p.388 확인문제 3번의 1번에 관련된 내용 . 객체만들수 있음
        o1.field = new MyClass151();
        o1.field = new MyClass152();

        //확인문제 3 - 보기 2
        method((new MyClass152()));
        method(new MyClass151());

        //확인문제 3 - 보기 3번
        MyInterface15[] arr= new MyInterface15[3];
        arr[0] = new MyClass151();
        arr[1]=  new MyClass152();

    }

    public static void method(MyInterface15 param) {

    }
}

interface MyInterface15 {

}

class MyClass151 implements MyInterface15{}

class MyClass152 implements MyInterface15{}
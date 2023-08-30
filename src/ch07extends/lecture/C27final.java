package ch07extends.lecture;

public class C27final {
    public static void main(String[] args) {
        //final 변수: 값을 한 번만 할당 할 수 있음

        final int a = 3; //final이 있으면 다시 값을 할당하지 못함
//        a = 4;
    }
}

class MyClass27 {
    final int age = 3;
    final String name; //여기서 "java"안하고 생성자에서 한번 할당해도 됨. 할당하는 방법이 여러가지

    MyClass27() {
        this.name = "java";
    }
}

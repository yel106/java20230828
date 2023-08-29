package ch07extends.lecture;

public class C01extends {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.age = 33;
        o1.method1();

        MySubClass011 o2 = new MySubClass011();
        o2.age = 44;
        o2.method1();


    }
}

//MyClass01의 멤버(field, method) 를 상속함 , 생성자까지 멤버라고 하는 책도 있음
class MySubClass011 extends MyClass01 {  //밑에 있는 메소드와 같은 기능을 하는 경우, 또 써야 할까? 상속을 쓰면 됨

}


class MyClass01 {
    int age;

    void method1() {
        System.out.println("MyClass01.method1" + age); //soutm 쓰면 만들어짐
    }
}
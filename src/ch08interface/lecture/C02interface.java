package ch08interface.lecture;
//인터페이스 사용하는 이유: 추상메소드를 이용하도록 강제하는 효과가 있음. 인터페이스의 탄생목적이 추상메소드 집합. 여기서 나중에 더 추가가 된것.

public class C02interface {
    public static void main(String[] args) {
        MyClass021 o1 = new MyClass021();
        MyInterface02 i2 = o1;

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i2));

        MyInterface02 i3 = new MyClass021();

        System.out.println(System.identityHashCode(i3));

        i3.method1();
        i3.method2();

        MyInterface02 i4 = new MyClass022();


        i4.method1();
        i4.method2();

    }
}

class MyClass022 implements MyInterface02 { //Alt+ inset 누르면 내가 해야할 일이나옴

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

interface MyInterface02 {
    //추상 메소드(몸통이 없는 인스턴스 메소드)
    abstract public void method1();


    void method2(); //public, abstract 안써도 그냥 쓴거나 마찬가지

}


 class MyClass021 implements MyInterface02 {  ////인터페이스에서는 imlement 사용  ,추상클래스가 안되려면 오버라이드 해야함


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
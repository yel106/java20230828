package ch08interface.lecture;

public class C03interface {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        o1.method1();
        o1.method2();

        // i1이든 i2이든 상관없다.
        MyInterface031 i1 = o1; //형변환
        MyInterface032 i2 = o1;

        //셋 다 같은 참조값을 가짐
        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        i1.method1(); // i1은 031타입이라서 1만되고 메소드2는 안됨
//        i1.method2();

//        i2.method1();
        i2.method2();
    }
}

interface MyInterface031 {
    void method1();
}

interface MyInterface032 {
    void method2(); //추상 메소드 public abstract는 생략 가능
}

//여러 인터페이스를 구현할 수 있다.
class MyClass03 implements MyInterface031, MyInterface032 {  //인터페이스는 1개이상 구현가능
 //인터페이스 2개구현했으면 메소드 재정의도 똑같이 해줘야함

    @Override
    public void method1() {
        System.out.println("MyClass03.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass03.method2");
    }
}
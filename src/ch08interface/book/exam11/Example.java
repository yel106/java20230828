package ch08interface.book.exam11;

public class Example {
    private static void action(A a) {
        a.method1();
        if( a instanceof C c   ) {     //A가 아니라 a라고 해야함, a가 c의 인스턴스일때만 실행되도록 해야함
            c.method2();
        }
    }

    public static void main(String[] args) {

        action(new B()); //여기서 Alt + Enter써도 됨
        action(new C()); //new:
        // 힙 메모리에 객체 메모리를 할당시키는 역할을 함. 생성자를 호출하면서 객체를 만들어주는 연산자임
    }



}

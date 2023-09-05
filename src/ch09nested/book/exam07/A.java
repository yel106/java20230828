package ch09nested.book.exam07;

//메소드와 생성자 안에 클래스를 만들수 있음. 한번 쓰고 버리려고...
public class A {
    //메서드
    void useB() {
        //로컬클래스
        class B {
            //인스턴스 필드
            int field1 = 1;

            //정적 필드
            static int field2 = 2;

            //생성자
            B() {
                System.out.println("B-생성자 실행");
            }

            //인스턴스 메소드
            void method1() {
                System.out.println("B-method1 실행");
            }

            //정적 메소드
            static void method2() {
                System.out.println("B-method2 실행");
            }
        }

        //로컬 객체 생성
        B b = new B();

        //로컬 객체의 인스턴스 필드와 메소드 사용
        System.out.println(b.field1);
        b.method1();

        //로컬 클래스의 정적 필드와 메소드 사용
        System.out.println(B.field2);
        B.method2();

    }
}

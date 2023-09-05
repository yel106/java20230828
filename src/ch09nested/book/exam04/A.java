package ch09nested.book.exam04;

public class A {
    //A의 인스턴스 필드와 메소드
    int field1;
    void method1() { }

    //A의 정적 필드와 메소드
    static int field2;
    static void method2() { }

    //인스턴스 멤버 클래스
    class B {
        void method() {
            //A의 인스턴스 필드와 메소드 사용
            field1 = 10;  //인스턴스에서 인스턴스 접근은 가능
            method1();     //인스턴스에서 인스턴스 접근은 가능

            //A의 정적 필드와 메소드 사용
            field2 = 10; //인스턴스에서 스태틱은 접근가능
            method2(); //인스턴스에서 스태틱은 접근가능
        }

        //정적 멤버클래스
        static class C {
            void method() {
                //A의 인스턴스 필드와 메소드 사용
                //field1 = 10; //인스턴스에서 스태틱 접근 불가능
                //method1(); //인스턴스에서 스태틱 접근 불가능

                //A의 정적 필드와 메소드 사용
                field2 = 10; //스태틱에서 스태틱 접근가능
                method2(); //스태틱에서 스태틱 접근가능
            }

        }


    }

}

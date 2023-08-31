//package ch07extends.book.sec08.exam6;
//
//public class D extends A{
//    //D클래스는 A클래스와 다른 패키지에 있지만 A의 자식 클래스이기 때문에 A의 protected필드 , 생성자, 메소드에 접근이 가능함.
//    //new 연산자 사용해서 생성자 직접 호출안되고, 자식 생성자에서 super로 생성자 호출가능
//
//
//    public class D extends A {
//        //생성자 선언
//        public D() {
//            //A() 생성자 호출
//            super();            //o
//        }
//
//        //메소드 선언
//        public void method1() {
//            //A필드값 변경
//            this.field = "value"; //o
//
//            //A메소드 호출
//            this.method();          //o
//        }
//
//
//        //메소드 선언
//        public void method2() {
//            A a = new A();      //x
//            a.field = "value"; //x
//            a.method();         //x
//        }
//
//    }
//}

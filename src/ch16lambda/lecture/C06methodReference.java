package ch16lambda.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        MyInterface06 o1 = a -> C06methodReference.someMethod(a);

        //메소드 참조(method reference)
        MyInterface06 o2 = C06methodReference::someMethod; //a파라미터로 받은 값을 다른메소드의 파라미터에 들어가기만 하는용도면 더 줄일수 있음


    }

    public static void someMethod(int x) {

    }
}
interface MyInterface06{
    void method(int a);
}

package ch11exception.lecture;

public class C20polymorphism {
    public static void main(String[] args) throws ReflectiveOperationException {
        method1();
    }


    public static void method1() throws ReflectiveOperationException { //더 상위exception으로 할수 있음
         method2();
    }

    public static void method2() throws ClassNotFoundException {

    }
}

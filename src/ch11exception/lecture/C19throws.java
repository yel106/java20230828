package ch11exception.lecture;

public class C19throws {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }


    public static void method1() throws ClassNotFoundException {
        method2();
    }

    public static void method2() throws ClassNotFoundException {
        method3(); //알트+ 엔터하면 트라이 캐치로 하거나 아니면 메소드에서 throws로 처리하도록 하는 방법을 힌트로 줌
    }
    public static void method3() throws ClassNotFoundException{

    }
}

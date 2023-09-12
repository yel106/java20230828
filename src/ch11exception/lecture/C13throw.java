package ch11exception.lecture;

public class C13throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method1(); //호출된 곳에서 exception을 받음
        } catch (RuntimeException e) {
            System.out.println("예외 발생!!!");
        }
        System.out.println("main code2");

    }


    public static void method1() {
        System.out.println("code1");
        throw new RuntimeException(); //호출한곳으로 exception이 던져짐
//        System.out.println("code2"); //컴파일 안되니까 쓸데없는 코드 작성했다고 알려줌
    }

    public static void method2() {
//        throw new Exception();
    }
}

package ch11exception.lecture;

public class C18throws {
    public static void main(String[] args) throws  ClassNotFoundException {
        //exception발생하는 메소드(생성자) 사용시
        //try-catch로 처리 또는 메소드에 throws로 명시
        method1();
    }

    public static void method1() throws ClassNotFoundException{ //런타임 exception말고 체크드 exception으로 할때 트라이캐치말고 메인메소드에서 넘길수도 있음

    }

}

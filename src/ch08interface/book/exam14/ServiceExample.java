package ch08interface.book.exam14;

public class ServiceExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언과 구현 객체 대입
        Service service = new ServiceImpl();

        //디폴트 메소드 호출
        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        //정적메소드 호출
        Service.staticMethod1();
        Service.staticMethod2();
    }

}

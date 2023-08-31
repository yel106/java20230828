package ch08interface.book.exam06;

import ch08interface.book.exam04.D;

public class DriverExample {
    public static void main(String[] args) {
        //DRiver 객체 생성
        Driver driver = new Driver();

        //Vehicle 구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //매개값으로 구현 객체 대입(다형성: 실행 결과가 다름)
        driver.drive(bus); //자동 타입 변환> 오버라이딩 메소드 호출> 다형성 //버스든 택시 인스턴스든 다 됨
        driver.drive(taxi); //자동 타입 변환> 오버라이딩 메소드 호출> 다형성
    }
}

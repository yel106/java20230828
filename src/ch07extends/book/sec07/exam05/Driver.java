package ch07extends.book.sec07.exam05;

public class Driver {
    //메소드 선언( 클래스 타입의 매개변수를 가지고 있음)
    public void drive(Vehicle vehicle) {  //parameter로 데이터타입을 받음 . vehicle 인스턴스가 뭐든 상관없음. 버스도 택시도 탈것의 상속을 받아서 상관없음
        vehicle.run();
    }
}

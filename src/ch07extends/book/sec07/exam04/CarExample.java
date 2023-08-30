package ch07extends.book.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();

        //Tire객체 장착
        myCar.tire = new Tire();
        myCar.run();

        //HankookTire로 객체 장착
        myCar.tire = new HankookTire(); //tire인스턴스가 한국타이어로 바꼈을때는 재정의된 run()메소드가 실행됨
        myCar.run();

        //KumhoTire 객체 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}

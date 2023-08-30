package ch07extends.book.sec07.exam05;

public class DriverExample {
    public static void main(String[] args) {
        //Driver 객체 생성
        Driver driver = new Driver();

        //매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
        Bus bus = new Bus();       //driver.drive(new Bus() );와 동일
        driver.drive(bus);   //버스를 넣으면 택시의 run메소드가 실행됨

        //매개값으로 taxi객체를 제공하고 driver() 메소드 호출
        Taxi taxi = new Taxi(); //driver.drive(new Taxi() );와 동일
        driver.drive(taxi);   //드라이브 메소드를 vehicle로 받는다고 했는데 taxi도 vehicle을 상속 받았으니까 실행이 됨.
        // drive 메소드는 run()메소드를 실행한다고 했음
    }
}

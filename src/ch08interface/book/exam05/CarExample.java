package ch08interface.book.exam05;

public class CarExample {
    public static void main(String[] args) {
        //자동차 객체 생성
        Car myCar = new Car();

        //run() 메소드 실행
        myCar.run();

        //타이어 객체 교체
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        //run() 메소드 실행( 다형성: 실행결과가 다름)
        myCar.run();
    }
}
//Tire에 roll메서드가 있기 때문에 사용가능
       // tire1.roll(); //인터페이스에 선언된 추상 메소드 호출 > 구현 객체의 roll() 메소드 실행
                //tire2.roll(); // Tire타입이고 롤메서드가 있다는게 보장이 되니까 tire1이든 tire2이든 뭐가오든 상관없음
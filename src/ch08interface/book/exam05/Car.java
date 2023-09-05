package ch08interface.book.exam05;

public class Car {
    //필드
    Tire tire1 = new HankookTire(); //get set생략 .
    Tire tire2 = new HankookTire();

    //메소드
    void run() { //Tire에 roll메서드가 있기 때문에 사용가능
        tire1.roll(); //인터페이스에 선언된 추상 메소드 호출 > 구현 객체의 roll() 메소드 실행
        tire2.roll(); // Tire타입이고 롤메서드가 있다는게 보장이 되니까 tire1이든 tire2이든 뭐가오든 상관없음

    }
}

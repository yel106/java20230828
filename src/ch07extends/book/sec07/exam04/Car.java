package ch07extends.book.sec07.exam04;

public class Car {

    //필드 선언. int a 하는것과 같이
    public Tire tire;// 이전과 다른것은 Tire tire = new Tire 라고 쓰지 않은것.
    //tire대신 금호타이어 인스턴스가 오더라도 Tire클래스를  상속 받았기 때문에  Tire타입이여서 밑에서 메소드를 실행시킬 수 있음


    //tire필드에 대입된 객체의 roll() 메소드 호출
    public void run() {
        tire.roll(); //Tire타입이기만 하면 객체 tire는 roll()메소드를 실행함 .
    }
}

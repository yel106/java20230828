package ch08interface.book.exam01;

public class Television implements RemoteControl {  //인터페이스는 구현한다고 표현함
    //인터페이스에 선언된 turnOn() 추상메소드 재정의
    @Override
    public void turnOn() {  //인터페이스를 통해 보장이됨
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}

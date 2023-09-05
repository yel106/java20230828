package ch08interface.book.exam03;

import ch08interface.book.exam01.RemoteControl;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {

        //RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl rc = new SmartTelevision();

        //RemoteCOntrol 인터페이스에 선언된 추상 메소드만 호출 가능
        rc.turnOn();
        rc.turnOff();

        //Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable searchable = new SmartTelevision();

        //Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
        searchable.search("http://www.youtube.com");
    }
}

package ch07extends.book.sec08.exam03;

public abstract class Phone {

    String owner;

    //생성자 선언
    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }

}

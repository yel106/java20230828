package ch07extends.book.sec08.exam03;

public class PhoneExample {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("홍길동"); //폰은 추상클래스라서 인스턴스 만들수 없고, 자식인 스마트폰으로 인스턴스를 만듦

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}

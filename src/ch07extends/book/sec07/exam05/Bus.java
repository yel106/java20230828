package ch07extends.book.sec07.exam05;

public class Bus extends Vehicle {

    //메소드 재정의
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

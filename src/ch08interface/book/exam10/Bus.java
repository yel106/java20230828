package ch08interface.book.exam10;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void chekFare() {
        System.out.println("승차요금을 체크합니다.");
    }
}

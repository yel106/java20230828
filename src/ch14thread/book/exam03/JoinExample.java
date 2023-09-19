package ch14thread.book.exam03;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(); //join메소드를 안쓰면 메인 메소드와 같이 실행되는데 100까지 더하기 전일수도 있어서 join써야 합이 나옴
        } catch (InterruptedException e) {
        }
        System.out.println("1~100까지의 합: " + sumThread.getSum());
    }
}

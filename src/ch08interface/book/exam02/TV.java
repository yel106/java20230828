package ch08interface.book.exam02;

public class TV implements Remocon {

    @Override
    public void powerOn() {
        System.out.println("티비를 켭니다.");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();

    }
}

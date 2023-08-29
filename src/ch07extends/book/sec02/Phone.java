package ch07extends.book.sec02;

public class Phone {

    //필드 선언
    public String model;
    public String color;

    //함수 선언
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    //메시지로 받겠다고 함
    public void sendVoice(String message) {
        System.out.println("본인: " + message);

    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}



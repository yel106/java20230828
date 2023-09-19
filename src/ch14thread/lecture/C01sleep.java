package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {
        //쓰레드는 업무흐름 . 업무흐름을 slepp이 1000millis(밀리세컨드) =1초만큼 잠깐 멈춤
        //sleep 메소드는  thread 라는 클래스 안에 static으로 존재
        System.out.println("cod1");
        Thread.sleep(1000); // Alt+ Enter쳐서 add exception~ 선택
        System.out.println("cod2");
        Thread.sleep((1000));
        System.out.println("cod3");


    }
}

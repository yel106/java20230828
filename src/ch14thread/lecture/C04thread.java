package ch14thread.lecture;

import java.awt.*;

public class C04thread {
    public static void main(String[] args) {
        //thread 만들기
        Thread thread = new MyThread(); // 상속받았으니까 다형성에 의해 thread는 MyTread라고 할수 있음

        //thread 시작
        thread.start();

        Thread thread1 = new YourThread();
        thread1.start();



    }
}

//쓰레드 클래스를 상속받아서 만들면됨
class MyThread extends  Thread {
    @Override
    public void run() {
        //run메소드: thread가 해야할 일 작성
        for( int i=0; i<5; i++) {
        System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {


            }

        }
    }
}

class YourThread extends  Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

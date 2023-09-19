package ch14thread.lecture;

import java.awt.*;

public class C05runnable {
    //인터페이스를 구현하거나, thread만들 때 runnable 타입의 객체를 넣어서 쓰는것
    public static void main(String[] args) {
//        Runnable r1 = new MyRunnable();
//        Thread thread1 = new Thread(r1);

        //위 두줄을 한 줄로 표현한 것.
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        Runnable r2 = new YourRnnable();
        Thread thread2 = new Thread(r2);
        thread2.start();

    }
}



class YourRnnable implements Runnable {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for( int i=0; i< 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        //thread가 실행할 작업 작성
        for( int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

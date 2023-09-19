package ch14thread.lecture;

import java.awt.*;

public class C03thread {
    public static void main(String[] args) throws InterruptedException {

        //소리와 문자가 동시에 나타나도록
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("띵");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread.start();


        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for( int i=0; i<5; i++){
            toolkit.beep();
            Thread.sleep(1000);
        }



    }
}

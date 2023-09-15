package ch18io.book.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {

        try {
            OutputStream os = new FileOutputStream("C:/Temp/test1.db");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush(); //write를 쓰면 buffer에 쌓여있다가 flush를 쓰면 내부 버퍼에 잔류하는 바이트를 목적지로 출력하고 버퍼를 비움
            os.close(); //출력 스트림을 닫아 사용한 메모리 해제
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

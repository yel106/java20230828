package ch18io.book.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";

        InputStream is = new FileInputStream(originalFileName);//입력
        OutputStream os = new FileOutputStream(targetFileName); //출력

        byte[] data = new byte[1024]; //1024씩 읽겠다. , 만약 7000으로 하면 한번만 읽어도 됨
        while (true) {
            int num = is.read(data);
            if(num== -1) {
                break;
            }
            os.write(data, 0, num); //0번 인덱스부터, num개만

        }

        os.flush();
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다.");

    }
}

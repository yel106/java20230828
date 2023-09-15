package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C07inputStream {
    public static void main(String[] args) {

        String path = "C:/Temp/out3.txt";
        try (InputStream is = new FileInputStream(path)) {
            int read = is.read(); //int는 4바이트고, read는 1바이트를 읽으니까 나머지 3바이트는 그냥 남음
            int read1 = is.read();
            int read2 = is.read();  //1바이트씩 읽음

            System.out.println("read = " + read); //65
            System.out.println("read1 = " + read1); //66
            System.out.println("read2 = " + read2); //67
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

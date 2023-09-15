package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C09read {
    public static void main(String[] args) {
        String file = "C:/Temp/out3.txt";
        try (InputStream is = new FileInputStream(file)) {
            byte[] b = new byte[3];
            is.read(b); //3바이트씩 읽음
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
            // 읽어올게 없으면 그 전 배열의 [1], [2]를 그대로 읽어오기 떄문에 그 전 값인 67, 67이 나오는것
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

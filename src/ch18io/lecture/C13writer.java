package ch18io.lecture;

import java.io.*;

public class C13writer {
    public static void main(String[] args) {
        // outputstream과 비교
        String file1 = "C:/Temp/out5.txt";
        String file2 = "C:/Temp/out6.txt";

        try {
            OutputStream os = new FileOutputStream(file1);
            Writer writer = new FileWriter(file2);

            try (os; writer) {

                os.write(65);
                writer.write(65);

                os.write(48124); //1바이트로 표현할 수 없지만 Write쓰면 자동으로 변환됨
                writer.write(48124); //영문자는 1바이트로 표현 가능. 그래서 문자 입출력 스트림을 안쓰는 경우 있음

                os.flush();
                writer.flush();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}

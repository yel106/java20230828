package ch18io.lecture;

import java.io.*;

public class C19filter {
    public static void main(String[] args) {
        String src = "C:/Temp/out8.txt";

        try {
            InputStream is = new FileInputStream(src);
            Reader reader = new InputStreamReader(is);

            System.out.println( (char) reader.read());
            System.out.println( (char) reader.read());
            System.out.println( (char) reader.read());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

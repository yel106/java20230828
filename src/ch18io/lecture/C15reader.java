package ch18io.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C15reader {
    public static void main(String[] args) {
        String path = "C:/Temp/out7.txt";
        //문자 단위 입력 스트림

        try( Reader reader = new FileReader(path)){
            int read = reader.read(); //문자열로 읽었는데 받는건 인티저
            char c1 = (char) read; //숫자말고 문자로 나와야되면 변환해서 써야함
            int read1 = reader.read();

            int read2 = reader.read();
            System.out.println("read = " + read); //손
            System.out.println("read1 = " + read1); //흥
            System.out.println("read2 = " + read2); //민

            System.out.println("c1 = " + c1);
            System.out.println("read1 = " + (char)read1);
            System.out.println("read2 = " + (char)read2);

            char[] chars = new char[3];
            int len1 = reader.read(chars);//앞에 3번 읽었으니까 ' 이'  부터 읽음, reader가 리턴하는 값이 몇개 읽었다는 것
            System.out.println("chars = " + Arrays.toString(chars));


            int len2 = reader.read(chars);reader.read(chars);
            System.out.println("chars = " + Arrays.toString(chars));

            int len3 = reader.read(chars);reader.read(chars);
            System.out.println("chars = " + Arrays.toString(chars));


            System.out.println("len1 = " + len1);
            System.out.println("len2 = " + len2);
            System.out.println("len3 = " + len3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

package ch18io.book.exam09;

import java.io.*;

import static java.lang.module.ModuleDescriptor.read;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);

    }


    public static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8"); //FileOutputSream에 OutputStreamWriter 보조 스트림을 연결
        writer.write(str); //OutputStreamWriter 보조스트림을 이용해서 문자 출력
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
        InputStream is = new FileInputStream("C:/Temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");//문자단위로 바꾸고 싶어서 씀
        char[] data = new char[100]; // InputStreamReader 보조 스트림을 이용해서 문자입력
        int num = reader.read(data  );
        reader.close();
        String str = new String(data, 0, num); //char 배열에서 읽은 문자수만큼 문자열로 변환
        return str;


    }

}

package ch18io.book.exam08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

            // 1문자씩 읽기
            reader = new FileReader("C:/Temp/test.txt"); //텍스트 파일로부터 문자입력 스트림 생성
            while (true) {
                int data = reader.read(); //1문자를 읽음
                if (data == -1) break; //파일 다 읽으면 while문 종료
                System.out.println((char) data); //그냥하면 인티저로 나오니까 char로 형변환해서 읽은 문자 출력
            }
            reader.close();
            System.out.println();

            //문자 배열로 읽기
            reader = new FileReader("C:/Temp/test.txt"); //텍스트 파일로부터 문자 입력 스트림 생성
            char[] data = new char[100]; //읽은 문자를 저장할 배열 생성. 배열만들어서 읽음 . 100개보다 많이 읽었으면 100개가 다 저장. 30개만 읽었으면 나머지 70개는 이전에 읽은걸로 남아있음. 주의
            while (true) {
                int num = reader.read(data); //읽은 문자는 배열에 저장, 읽은 문자수는 리턴
                if (num == -1) break; //파일 다 읽으면 while문 종료. 더이상읽을게 없으면 -1을 리턴함
                for (int i = 0; i < num; i++) {  //읽은 문자 수 만큼 출력
                    System.out.println(data[i]);
                }
            }

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

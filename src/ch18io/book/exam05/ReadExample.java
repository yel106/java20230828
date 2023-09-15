package ch18io.book.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test2.db")) {

            byte[] data = new byte[100]; //배열길이가 100이니까 3바이트만 읽고 나머지 97은 남음
                            //data[3]부터 나머지는 0으로 출력됨
            while (true) {
                int num = is.read(data); //최대 100byte읽고 읽은 바이트는 data 저장. 읽은 수는 리턴
                if (num == -1) break; //파일 끝에 도달하면

                for (int i = 0; i < num; i++) { //읽은 바이트를 출력
                    System.out.println(data[i]);
                }

            }
            is.close(); //배열의 모든 바이트 출력
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

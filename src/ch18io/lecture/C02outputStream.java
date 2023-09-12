package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02outputStream {
    public static void main(String[] args) {
        //OutputStream: 바이트단위 출력 스트림
        try {
            OutputStream os = new FileOutputStream("out.txt"); //api보면 어떻게 써야하는지 알수 있음
            os.write(70); //아웃풋스트림. int 4바이트중 마지막 1바이트만 들어감
            os.write(71); //1바이트만 들어감
            os.write(73);  //1바이트만 들어감

            //stream이 열리면 다시 닫아줘야함
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

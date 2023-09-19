package ch19network.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class C03client {
    public static void main(String[] args) {

        //C03, C04연결 . C04먼저 실행시킨 후에 C03 실행시켜야함

        try {


            Socket socket = new Socket("172.30.1.43", 3000);


            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            try ( socket; is; isr; br) {
                String line = br.readLine();
                System.out.println("서버가 보낸 내용 = " + line);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

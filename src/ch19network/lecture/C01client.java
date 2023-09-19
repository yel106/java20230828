package ch19network.lecture;

import java.io.*;
import java.net.Socket;

public class C01client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.1.43", 3000); //소켓을 열어야함 (주소, port number) 연결시도
            //실행해보면 connect가 안된다고 뜸
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(writer);

            try (socket; writer; bw;)   {
            bw.write("안녕하세요");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

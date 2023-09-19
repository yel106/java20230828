package ch19network.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C02server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();//누군가 연결해주길 기다리는 메소드

                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

            try (serverSocket; socket; br; isr; is;) {

                String line = br.readLine();
                System.out.println("line = " + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

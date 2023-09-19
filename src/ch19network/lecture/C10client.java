package ch19network.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class C10client {
    public static void main(String[] args) {

        try {
        Socket socket = new Socket("172.30.1.81", 7000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        new Thread(() -> {
            try {
                String serverResponse;
                while ((serverResponse = in.readLine()) != null) {
                    System.out.println("서버응답 :" + serverResponse);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        try (out; socket; consoleReader) {
            String message;
            while (true) {
                System.out.println("메시지 입력:");
                message = consoleReader.readLine(); //콘솔에서 메시지 입력받기

                if (message.equalsIgnoreCase("exit")) {
                    break; //exit입력시 종료
                }
                out.println(message); //서버에 메시지 전송
            }

        }
         } catch(Exception e) {

        e.printStackTrace();
        }
    }
}




//선생님이 하신 것.
//public class C10client {
//    public static void main(String[] args) {
//        try {
//
//            Socket socket = new Socket("172.30.1.81", 7000);
//
//            OutputStream outputStream = socket.getOutputStream();
//            OutputStreamWriter writer = new OutputStreamWriter(outputStream);
//            BufferedWriter bufferedWriter = new BufferedWriter(writer);
//
//            Scanner scanner = new Scanner(System.in);
//
//            try (scanner; bufferedWriter; writer; outputStream; socket) {
//
//                while (true) {
//                    System.out.print("입력>");
//                    String chat = scanner.nextLine();
//                    bufferedWriter.write(chat);
//                    bufferedWriter.newLine();
//                    bufferedWriter.flush();
//
//                    if (chat.equals("bye")) {
//                        break;
//                    }
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
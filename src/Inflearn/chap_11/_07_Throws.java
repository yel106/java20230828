package inflearn.chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();   //메인메소드에서 던진 예외를 writeFile을 실행시키는 메소드가 catch함
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요.");
        }
    }


//    메소드 내에서 트라이캐치를 통해 자체적으로 해결할수도 있지만
//    메소드 내에서 해결하지 않고, throw를 통해 메소드를 호출한 메인에서 처리하도록 미룰 수 있음
    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기에 실패했어요!");
//            //throw로 던진것을 catch에서 받음
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요");
//        }

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했어요!");
        // 이 상태에서 Alt + enter 누르고 add exception to method signature 를 선택하면 됨
        //메소드명 옆에 ' throws IOException ' 이게 생김
    }
}

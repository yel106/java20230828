package ch18io.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23keyboard {
    public static void main(String[] args) {
        try {
            InputStream keyboard = System.in; //바이트 단위로 입력됨. 우리는 문자열로 입력해야함
            InputStreamReader isr = new InputStreamReader(keyboard); //Scanner말고 인풋스트림 이용
            BufferedReader br = new BufferedReader(isr);

//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); //이렇게 한 줄로 쓸수도 있음

            try (br; isr;) {
                String line1 = br.readLine(); //한줄씩 읽음

                System.out.println("line1 = " + line1);

                String line2 = br.readLine(); //한줄씩 읽음

                System.out.println("line2 = " + line2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
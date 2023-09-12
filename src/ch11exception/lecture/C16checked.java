package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C16checked {
    public static void main(String[] args) {
        try {
            var input = new FileInputStream("file");
            //checked exception은 예외 처리 코드를 꼭 작성해야함

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}

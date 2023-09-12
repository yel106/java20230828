package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C21throws {
    public static void main(String[] args) throws FileNotFoundException {
        var input = new FileInputStream("file");// 파일로부터 뭘 읽어오기 위한 객체
       //체크드 exception이니까 트라이 캐치나 throws써야함



    }
}

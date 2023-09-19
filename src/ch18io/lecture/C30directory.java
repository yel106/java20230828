package ch18io.lecture;

import java.io.File;

public class C30directory {
    public static void main(String[] args) {
        String path = "C:/Temp/test";
        File file = new File(path);

        System.out.println("file.exists() = " + file.exists()); //처음엔 false, 디렉토리 만들고 나서 true가 됨

        //디렉토리 없을때 디렉토리를 만들어본다면?
        if (!file.exists()) {
            file.mkdir(); //디렉토리 만들기
        }




    }
}

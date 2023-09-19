package ch18io.lecture;

import java.io.File;

public class C29file {
    public static void main(String[] args) {
        String path = "C:/Temp";
        File file = new File(path);

        //디렉토리인지?
        System.out.println("file.isDirectory() = " + file.isDirectory()); //true

        //파일 목록 얻기
        File[] files = file.listFiles(); // File[] files 이라는 변수로 받기

        //파일 정보 출력하기
        for (File f :
                files) {
            System.out.println("f.getName() = " + f.getName());
        }

    }
}

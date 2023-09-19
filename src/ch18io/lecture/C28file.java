package ch18io.lecture;

import java.io.File;
import java.util.Date;

public class C28file {
    public static void main(String[] args) {
        //번외. 파일관련 내용. 
        // java.io.File

        String path= "src/ch18io/lecture/C28file.java";
        File file = new File(path);

        // 크기
        System.out.println("file.length() = " + file.length());
        //있는지?
        System.out.println("file.exists() = " + file.exists());

        //경로
        System.out.println("file.getPath() = " + file.getPath());
        //마지막수정일시
        System.out.println("file.lastModified() = " + file.lastModified());
        System.out.println("file.lastModified() = " + new Date(file.lastModified())); //날짜 변경하기
        //구글에 java long to date라고 검색
        
        //디렉토리인지?
        System.out.println("file.isDirectory() = " + file.isDirectory());// 디렉토리 아니니까 false나옴





    }
}

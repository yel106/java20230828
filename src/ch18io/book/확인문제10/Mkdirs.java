package ch18io.book.확인문제10;

import java.io.*;
import java.util.Scanner;

public class Mkdirs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String path1 = sc.nextLine();
        String path2 = sc.nextLine();

        File inputfile = new File(path1);
        File outputfile = new File(path2);

        if (inputfile.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
        }

        File outputdir = outputfile.getParentFile();
        if( !outputdir.exists()) {
            outputdir.mkdirs();
        }


        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputfile)); //21copy에서 쓴 내용과 동일.
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputfile));


                byte[] buffer = new byte[1024];
                int byteRead;

                while ( (byteRead = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, byteRead);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

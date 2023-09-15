package ch18io.lecture;

import java.io.*;

public class C21copy {
    //BufferedInputStream
    //BufferedOutputStream
    //그림 파일 복사하는 코드
    public static void main(String[] args) {
        String src = "C:/Temp/test.jpg";
        String dec= "C:/Temp/test.jpg";

        try {

            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dec);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try (fis; fos; bis; bos) {
                byte[] buf = new byte[1024];
                int len = 0;

                long start = System.currentTimeMillis();
                while ((len = bis.read(buf)) != -1) {
                    bos.write(buf, 0, len);
                }
                bos.flush();
                long end = System.currentTimeMillis();

                long diff = end - start;
                System.out.println("diff = " + diff);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }







        }


    }








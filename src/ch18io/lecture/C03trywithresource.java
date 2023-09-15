package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public void method1() {
        OutputStream os = null;

        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close(); // ios stream을 꼭 닫아야함
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public void method2() {
       //try -with-resource 문법
        //exception이 나든 안나든 close를 꼭 실행시켜줌. os.close() 안써도 자동으로 닫아줌
        //변수 타입은 AutoCloseable이어야함. OutputStream도 api보면 AutoCloseable임
        try (OutputStream os = new FileOutputStream("");){
            os.write(33);
            os.write(67);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public void method3( ) {

        try {
            FileOutputStream fos = new FileOutputStream("");
            FileOutputStream fis = new FileOutputStream("");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void method4(){
        Scanner scanner = new Scanner("");

        try (scanner) { //값이 할당 됐을땐 변수명만 써도 됨
            scanner.hasNext();
            scanner.next();
        }

//        scanner.close(); //스캐너도 쓰고 잘 닫아줘야함 이것도 Autocloseable type임

    }

    public void method5() {
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            try (fio;fos) {

                fio.read();
                fos.write(33);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public void method6() throws IOException {
        // 안좋은 코드임...

        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33); //throw로 던지면 exception이 발생됐을떄 close가 실행되지 못하고 메소드 호출한 곳으로 넘겨졌으니 좋은 코드가 아님
        fis.read();

        fos.close();
        fis.close();
    }

}

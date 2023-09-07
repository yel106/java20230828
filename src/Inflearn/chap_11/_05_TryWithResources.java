package inflearn.chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close(); //close에 빨간줄 뜰 떄 surround with try/catch 클릭
                //close를 하다가 발생할 수 있는 문제를 또 catch를 통해서 처리해준것
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("------------------------");


        //Try With Resources 객체를 try( ) 안에 정의 하고 실행시킬떄 자동으로
        //Try catch구문을 빠져 나올 떄 close()를 호출해줌.
        //대신 AutoCloseable이라는 인터페이스를 구현하는 클래스의 경우에만 가능
        //Try With Resources를 써서 try  괄호 안에 객체를 집어넣고
        //
        try (MyFileWriter wirter2 = new MyFileWriter()) {
            wirter2.write("빵이 먹고 싶어요.");
        }catch (Exception e) {
            e.printStackTrace();
        }

        BufferedWriter bw = null;
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력내용: " + line);
    }

}

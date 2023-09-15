package ch18io.book.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("C:/Temp/test3.db")) {

            byte[] array = {10, 20, 30, 40, 50};
            os.write(array, 1, 3);  //off 어디부터. length 몇개

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

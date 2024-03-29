package ch18io.lecture;

import java.io.*;

public class C16copy {
    public static void main(String[] args) {
        String src = "src/ch18io/lecture/C16copy.java";
        String des = "C:/Temp/C16copy.java";

        try {
            Reader reader = new FileReader(src);
            Writer writer = new FileWriter(des);

            try (reader; writer) { //try 블록을 빠져나가면 reader와 writer 객체를 자동으로 닫는 역할. reader.close(), writer.close()할 필요없이 자동으로 닫힘
                char[] chars = new char[100];
                int len = 0;

                while ((len = reader.read(chars)) != -1) {
//                    for (int i = 0; i < len; i++) {
//                        System.out.print(chars[i]);
//                    }
                writer.write(chars, 0, len);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
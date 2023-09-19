package ch18io.book.확인문제7;

import java.io.BufferedReader;
import java.io.FileReader;
 // 확인문제 1. 답: 1
 //확인문제2. 답: 1 이미지데이터는 reader로 읽을수 없음. 문자데이터는 둘다 가능
 // 확이문제 3. 답: 3. 제한 있음. 배열 길이만큼
 // 확인문제 4. 답: 1
public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18io/book/확인문제7/Example.java";
        //BufferedReader.readLine메소드
        //PrintStream.printf  써서 문제 풀어보기

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;

        while(true) {
            rowData = br.readLine(); //한줄 한줄 읽음
            rowNumber++;
            if( rowData ==null) {    //BufferedReader는 읽을게 없으면 null값을 냄
                break;
            }
            System.out.printf("%2d: %s%n", rowNumber, rowData); //2d 2칸 차지한다는 뜻

        }

        br.close(); fr.close(); //이렇게 클로즈 닫아도 되고 밑에 주석 단 것 처럼 try catch문 써도 됨


    }
}




//try catch써서 해도 됨

//    public static void main(String[] args) {
//        String filePath = "src/ch18io/book/exercise/p07/Example.java";
//
//        // BufferedReader.readLine
//        // PrintStream.printf
//
//        try {
//
//            FileReader fr = new FileReader(filePath);
//            BufferedReader br = new BufferedReader(fr);
//
//            try (br; fr;) {
//
//                int rowNumber = 0;
//                String rowData;
//                while (true) {
//                    rowData = br.readLine();
//                    rowNumber++;
//                    if (rowData == null) {
//                        break;
//                    }
//
//                    System.out.printf("%2d: %s%n", rowNumber, rowData);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



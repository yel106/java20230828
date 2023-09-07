package ch15collection.book.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 컬렉션 생성
        List<Board> list = new ArrayList<>();

        //객체 추가
        list.add(new Board("제목1","내용1", "글쓴이1"));
        list.add(new Board("제목2","내용2", "글쓴이2"));
        list.add(new Board("제목3","내용3", "글쓴이3"));
        list.add(new Board("제목4","내용4", "글쓴이4"));
        list.add(new Board("제목5","내용5", "글쓴이5"));

        //저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        //특정 인덱스의 객체 가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() +
                "\t" + board.getWriter());
        System.out.println();
        //향상된 for문
        //foreach

        System.out.println("foreach 사용1");
        list.forEach(e -> System.out.println(e.getSubject() + "\t" + e.getContent() + "\t" +
                e.getWriter()));

        System.out.println("foreach사용 2");
//        list.forEach(System.out::println);
//        list.forEach(e -> System.out.println(e)); //이 코드와 같음
//        list.forEach(e -> System.out.println(e.toString()));


        //객체 삭제
        list.remove(2);
        list.remove(2);

        //향상된 for문으로 모든 객체를 하나씩 가져오기
        for(Board b : list)
        {
            System.out.println(b.getSubject() + "\t" + b.getContent() +
                    "\t" + b.getWriter());
        }
    }
}

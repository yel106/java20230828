package ch15collection.book.확인문제7;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();

        for(Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }

        boolean contains = list.contains(new Board("제목1", "내용1"));
        System.out.println("contains=" + contains);

    }
}


class BoardDao {

    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));
        return list;
    }
}

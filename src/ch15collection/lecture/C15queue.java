package ch15collection.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class C15queue {
    public static void main(String[] args) {
        // queue : FIFO(First In First Out), 선입선출
        //주요 메소드
        // offer: 아이템 추가
        // poll: 아이템 꺼내기

        Queue<Integer> queue = new LinkedList<>(); //별일 없으면 구현할 건 LinkedList로 하기
        queue.offer(100);
        queue.offer(300);
        queue.offer(500);

        System.out.println(queue.size());

        Integer item1 = queue.poll();
        System.out.println(queue.size());

        Integer item2 = queue.poll();
        System.out.println(queue.size());

        Integer item3 = queue.poll();
        System.out.println(queue.size());

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

    }
}

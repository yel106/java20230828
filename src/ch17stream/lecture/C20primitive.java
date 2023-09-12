package ch17stream.lecture;

import java.util.stream.IntStream;

public class C20primitive {
    public static void main(String[] args) {
        // 기본타입 stream: IntStream, LongStream, DoubleStream
        // 참조타입 stream: Stream <T>

        //기본 타입 stream -> 참조타입 stream
        // boxed 메소드가 참조타입 반환
        Integer max = IntStream.of(3, 9, 1, 2, 7)
                .boxed() //원래 IntStream이였는데 Stream<Integer> 로 바뀜
                .max(Math::max) //파라미터 있어야함
                .get();
        System.out.println("max = " + max);




    }
}

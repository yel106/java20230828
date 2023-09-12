package ch17stream.lecture;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;



public class C19intStream {
    public static void main(String[] args) {

        //최댓값 구하기
        OptionalInt max = IntStream.of(4, 1, 5, 9, 10, 11)  //마지막에 ;을 닫지 말고 .max( )써야함
                .max();
        System.out.println("max = " + max.getAsInt());

        //최솟값 구하기
        OptionalInt min = IntStream.of(4, 1, 5, 9, 10, 11)  //마지막에 ;을 닫지 말고 .max( )써야함
                .min();
        System.out.println("min = " + min.getAsInt());

        //평균 구하기
        OptionalDouble avg = IntStream.of(4, 1, 5, 9, 10, 11)  //마지막에 ;을 닫지 말고 .max( )써야함
                .average();
        System.out.println("avg = " + avg.getAsDouble());

    }
}

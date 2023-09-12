package ch17stream.book.exam02;

import java.util.Arrays;

public class AgggregateExample {
    public static void main(String[] args) {
        //정수 배열
        int[] arr = {1, 2, 3, 4, 5};

        //카운팅
        long count = Arrays.stream(arr) //원래 배열에서 stream을 만듦
                .filter(n -> n%2==0) //짝수만 다음 스트림으로 넘겨라
                .count(); //long을 리턴함. 갯수
        System.out.println("2의 배수 개수 : " + count);

        //총합
        long sum = Arrays.stream(arr)
                .filter(n -> n%2 ==0)
                .sum();
        System.out.println("2의 배수의 합: " + sum);

        //평균
        double avg = Arrays.stream(arr)
                .filter(n -> n%2==0)
                .average()
                .getAsDouble();
        System.out.println("2의 배수의 평균: " + avg);

        //최댓값
        int max = Arrays.stream(arr)
                .filter(n -> n%2==0)
                .max()
                .getAsInt(); //인스턴스로부터 정수값을 추출할 때 사용함
        System.out.println("최댓값: " + max);

        //최솟값
        int min = Arrays.stream(arr)
                .filter(n -> n%2==0)
                .min()
                .getAsInt();
        System.out.println("최솟값: " + min);

        //첫번째 요소
        int first = Arrays.stream(arr)
                .filter(n -> n%3 ==0)
                .findFirst()
                .getAsInt();
        System.out.println("첫번째 3의 배수: " + first);
                


    }
}

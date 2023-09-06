package inflearn.chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class _05_Stream {
    public static void main(String[] args) {
        //스트림은 한번 쓰면 재사용 할수 없음

        //스트림 생성

        //Arrays.stream 이용하는 방법
        int [] scores = {100, 95, 90, 85, 80};
//        Arrays.stream(scores); //여기에서 crtl + alt + v 누르면 저절로 IntStream생성됨
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
//        Arrays.stream(langs); //ctrl + alt + V
        Stream<String> langStream = Arrays.stream(langs);

        //Collection.stream() 이용하는 방법
        List<String> langList = new ArrayList<>();
//        langList.add("python");
//        langList.add("java");
        //asList() 쓰면 .add하나씩 쓰는것과 같은 효과
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
//        System.out.println(langList.size());

        //리스트에서 스트림 만들기
//        langList.stream(); //여기서 ctrl + Alt + V하면 됨
        Stream<String> langListStream = langList.stream();


        //Stream.of() 이용하는 방법
//        Stream.of("python", "java", "javascript", "c", "c++", "c#"); //여기서 ctrl + Alt + V
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");




        //스트림 사용
        //중간연산이 있음. (Intermediate Operation):정수기의 여러개 필터같은것. filter, map, sorted, distinct, skip
        //최종 연산이 있음(Terminal operation) :한번만 쓸수있음. 최종적으로 나오는것. count, min, max, sum, forEach

        //90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >=90).forEach(x -> System.out.println(x)); //중간연산은 스트림 다음에 .(온점) 찍으면됨
        //출력하기 위해서 forEach를 써줌

        Arrays.stream(scores).filter(x -> x >=90).forEach(System.out::println); //::콜론이 두 번 붙음. 이렇게 해도 위랑 같은 결과 나옴
        //클래스명:: 메소드명을 콜론으로 구분해서 적으면 filter에서 쓴 데이터가  자동으로 넘어와서 들어옴
        System.out.println("------------------------");


        //90점 이상인 사람의 수
        long count = (int)Arrays.stream(scores).filter(x-> x >=90).count();
        System.out.println(count);
        System.out.println("------------------------------");

        //90점 이상인 점수들의 합
        int sum= Arrays.stream(scores).filter(x -> x>=90).sum();
        System.out.println(sum);
        System.out.println("------------------------------");

        //90점 이상인 점수들을 정렬
        Arrays.stream(scores).filter( x-> x>=90).sorted().forEach(System.out::println);//sotred 정렬


        //"python", "java", "javascript", "c", "c++", "c#"
        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);   //x가 langs배열에 있는것을 c로 시작하는 것만 하나씩 가져와서 필터링함.
        System.out.println("------------------------------");

        //java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter( x -> x.contains("java")).forEach(System.out::println);
        System.out.println("------------------------------");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach((System.out::println));
        System.out.println("------------------------------");

         //4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어
        langList.stream().filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("------------------------------");


        //4글자 이하의 언어 중에서  c글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langList.stream().filter( x -> x.length() <=4).anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("------------------------------");

        //4글자 이하의 언어들은 모두 c라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream().filter( x -> x.length() <=4).allMatch(x -> x.contains("c"));
        System.out.println(allMatch);


        //4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자 함께 출력
        //map: 우리가 사용하는 데이터를 원하는 데이터로 가공하거나 객체에서 꺼내고싶은 인스턴스 변수를 지정해줌
        langList.stream()
                .filter( x -> x.length() <=4)
                .filter(x -> x.contains("c"))
                .map(x -> x + "(어려워요)")
                .forEach(System.out::println);
        System.out.println("------------------------------");

        // C라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("-------------------------------");


        //c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        //langList.stream()
        //      .filter(x -> x.contains("c"))
        //    .map(String::toUpperCase)
        //  .collect(Collectors.toList());
        //.collect앞에 커서 놓고 ctrl + alt + V

        List<String> langListStartWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartWithC.stream().forEach(System.out::println);


    }
}

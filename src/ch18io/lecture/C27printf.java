package ch18io.lecture;

public class C27printf {
    public static void main(String[] args) {
        //width: 출력할 대상이 차지할 영역
        System.out.printf("@%1$s@%s", "java"); //java는 4개인데 $6 문자 6개의 영역을 확보.
        System.out.printf("@%1$6s@%s", "java");
        System.out.printf("@%1$2s@%s", "java");

        //flag : 출력방법
        // -: 왼쪽 정렬
        System.out.printf("@%1$6s@%n", "java");
        System.out.printf("@%1$-6s@%n", "java"); //6개의 영역을 차지하는데 왼쪽 정렬

        // precision
        //실수(f)와 같이 쓰면 소숫점 이하 출력갯수
        System.out.printf("%1$f%n", 3.141592); //conversion직전에 .과 같이 쓰면됨
        System.out.printf("%1$.3f%n", 3.141592);
        System.out.printf("%1$.1f%n", Math.PI);
        System.out.printf("%1$.0f%n", Math.PI);




    }
}

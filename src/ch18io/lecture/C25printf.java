package ch18io.lecture;

public class C25printf {
    public static void main(String[] args) {
        System.out.printf("출력할 문자들");
        System.out.printf("출력할 문자들2", "java", 3, 3.14); //자동으로 박싱되어 3.14도 나옴
        //  printf(String format, Object... args)

        // souf이 단축키
        System.out.printf("출력할 문자들3%n 다음줄 출력됨"); // %n쓰면 다음줄로 넘어감
        System.out.printf("출력...%n");
        System.out.printf("%n출력@@@");

        // %를 출력하고 싶다면? %%라고 쓰면 됨
        System.out.printf("%n%%:퍼센트");





    }
}

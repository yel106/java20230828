package ch12api.lecture;

public class C17replaceAll {
    public static void main(String[] args) {
        //replaceAll : 특정 패턴 -> 다른 문자열로 변경하는 메소드

        String a = "JAVA is java";
        String r = a.replace("java", "python");
        System.out.println(r);//리플레이스는 소문자 자바만 바뀜

        String r2= a.replaceAll("java|JAVA", "python");
        System.out.println(r2);

    }
}

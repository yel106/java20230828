package ch12api.lecture;

public class C16replace {
    public static void main(String[] args) {
        // replace: 특정문자열을 다른문자열로 변경
        String a = "spring";
        String t= a.replace("sp", "abc");
        System.out.println(a); //그대로 spring
        System.out.println(t); //api보면 원본이 바뀌는게 아니기 때문에 변수로 받아서 결과값을 출력해야 바뀐게 나옴

        String b = "java is java";
        String t2 = b.replace("java", "python");
        System.out.println(t2);

        String c = "JAVA is java";
        String t3 = c.replace("java", "html");
        System.out.println(t3); //대문자 JAVA는 안바뀌고 소문자 java만 바뀜

        


    }
}

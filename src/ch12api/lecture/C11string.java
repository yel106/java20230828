package ch12api.lecture;

public class C11string {
    public static void main(String[] args) {
        //String: 문자열
        String a = "java";
        String b = "java";
        String c= new String("java"); //스트링은 자주쓰니까 생략가능하게 한것.

        System.out.println(a== b);  //ture //new연산자만 참조값이 다름
        System.out.println(a== c); //false

        System.out.println(a.equals(b));//true
        System.out.println(a.equals(c));//true




    }
}

package ch11exception.lecture;

public class C17checked {
    public static void main(String[] args) {

        //힌트는 Alt + Enter쳐서 얻기
        try {
            Class.forName("java.lang.String");  //클래스의 forName이라는 메소드
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

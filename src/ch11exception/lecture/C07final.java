package ch11exception.lecture;

public class C07final {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int j=3/3;
            System.out.println("code2");
            return;  //return문(메소드 종료)이 있든 없든 finally 블럭은 무조건 실행됨
        } catch (ArithmeticException e) {
            System.out.println("code3");
        } finally {
            System.out.println("code4"); //return을 만나면 code4는 실행될수 없음. 그런데 실행하게 하고싶다면?

        }
        System.out.println("code5");
        }







}

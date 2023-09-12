package ch11exception.lecture;

public class C04try {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");

        try {
            int i=0;
            int j=3 / i;
            System.out.println("code3");
            System.out.println("code4"); //exception이 생기는 순간 code3, 4는 실행되지 않고 catch로 넘어감
        } catch( ArithmeticException e) {
            System.out.println("exception code1");
            System.out.println("exception code2");

        }
        System.out.println("code5");

    }
}

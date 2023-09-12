package ch11exception.lecture;

public class C14throw {
    public static void main(String[] args) {
        System.out.println("main code1");

        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code2");
    }

    private static void method3() throws Exception {
        throw new Exception();    //왜 RuntimeException은 되는데 Exceptio은 안될까?
        //런타임 예외는 예외코드를 작성했는지 확인 안하니까 오류 안뜨는데 Exception은 꼭 작성했는지 확인하기 떄문에 안 쓴경우 오류가뜸
//        private static void method3() throws Exception 라고 써주면 오류안뜸
    }
}

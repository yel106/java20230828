package inflearn.chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        //예외 처리
        //오류: 컴파일 오류(실행조차 안됨), 런타임 오류(컴파일은 되는데 실행과정에서 오류)
        //런타임 오류의 두가지 종류
        // 1. error(에러) :우리가 작성하는 소스코드를 통해 수정할 수 없는것
        // 2. exception(예외) : 코드를 통해 수습할 수 있는 것

        //컴파일 오류
//        int i = "문자열";

        //런타임 오류
//        int[] arr= new int[3];
//        arr[5] = 100;


        //예외처리의 기본문법
        try {
//           System.out.println(3/0); //문제발생
//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);

        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 =>" + e.getMessage());//문제가 생기면 catch문 내에서 처리가 됨
            e.printStackTrace();  // 출력: 이런 문제가 발생했어요 =>/ by zero(0으로 나누려는 시도를 했다고 뜸)
        }
        System.out.println("프로그램 정상 종료");









//class S {
//    public void methodA() {
//        this.methodA(); //자기 자신을 호출   >만약 실행하면 stack overflow 에러가 뜸
//    }
//}





    }
}

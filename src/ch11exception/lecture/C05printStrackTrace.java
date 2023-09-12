package ch11exception.lecture;

public class C05printStrackTrace {
    public static void main(String[] args) {
        System.out.println("code1");
        try {
            int i=0;
            int j = 3/i;
            System.out.println("code2");  //위에 exception발생으로 이코드는 실행되지 않음
        } catch ( ArithmeticException e) {

            //아무것도 안쓰면 메시지 안뜸
            e.printStackTrace(); //이걸 써야 메시지가 뜸. 안쓰면 나중에 에러나면 수정하기 어려움.
            //뭘 써야될지 모르겠으면 이거라도 쓰기

        }





        System.out.println("code3");
    }
}

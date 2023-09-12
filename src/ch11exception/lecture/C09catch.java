package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {

        try {
            int [] arr = {1, 0};
            int i= 3/ arr[1];
            System.out.println("try내의 흐름");
            //try block에서 여러 exception이 발생할 수 있으면
            //여러 catch블럭을 작성하면 됨
        } catch(ArithmeticException e) {
            System.out.println("잘못된 산술연산!!"); //int i= 3/ arr[1];을 하면 0으로 나눈거라 ArithmeticException이 뜸
        } catch(IndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스 참조"); // int i= 3/ arr[2];를 하면 배열을 초과하니까 IndexOutOfBoundsException이 뜸
        }

        System.out.println("실행흐름 이어감...");
    }
}

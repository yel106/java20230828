package inflearn.chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        //finally 예외가 발생하든 하지 않든 무조건 마지막에 해야되는 일을 적어줌
        //try내에서 에러가 없으면 바로 finally를 수행하고
        //에러가 있으면 catch가 받고, finally를 수행

        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
//            System.out.println("택시에 탑승한다.");
        } catch (Exception e) {
            System.out.println("!! 문제 발생 : " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }
        System.out.println("-------------");

        //try + finally
        try {
            System.out.println(3/0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}

package inflearn.chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
//           System.out.println(3/0); //문제발생

//            int[] arr = new int[3];
//            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);

            String s = null; //원래는 null값이기 때문에 toLowerCase()를 호출할 수 없음
            System.out.println(s.toLowerCase());

        } catch (ArithmeticException | NullPointerException e) {  //3을 0으로 나누려고 한 예외에 대해서만 별도로 처리를 해줌
            System.out.println("뭔가 잘못 계산을 하셨네요");
            //다른 예외처리에 대해서 "뭔가 잘못 계산을 하셨네요"라는 문자열을 출력하고 싶으면
            // | 쓰면 됨


        } catch (ArrayIndexOutOfBoundsException e) { //배열 잘못 설정한 것에 대한 예외를 처리하고 밖으로 빠져나감
            System.out.println("인덱스를 잘못 설정했어요.");
        } catch (ClassCastException e) {  //형변환에 실패했을때만 별도로 처리
            System.out.println("잘못된 형 변환입니다.");
        }

        catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요 =>" + e.getMessage());//문제가 생기면 catch문 내에서 처리가 됨
            e.printStackTrace();  // 출력: 이런 문제가 발생했어요 =>/ by zero(0으로 나누려는 시도를 했다고 뜸)
        }
        System.out.println("프로그램 정상 종료");
    }
}

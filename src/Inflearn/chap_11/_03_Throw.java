package inflearn.chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        //Thow를 통해 우리가 일부러 오류를 낼 수도 있음
        int age = 17; //만 17세
        try {
            if (age <19) {
                //System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                throw new Exception("만 19세 미만에게는 판매하지 않습니다.");   //throw쓰고 이 뒤에는 새로운 exception객체 쓰기
                //새로운 예외를 발생 시켜서 던짐. 그럼 catch에서 받음
            } else {
                System.out.println("주문 하신 상품 여기 있습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

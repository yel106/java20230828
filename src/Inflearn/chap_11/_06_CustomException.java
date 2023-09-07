package inflearn.chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        //사용자 정의 예외
        //모든 것을 예외 처리하기는 힘듦
        int age = 17; //만 17세
        try {
            if (age <19) {
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다.");
            } else {
                System.out.println("주문 하신 상품 여기 있습니다.");
            }
            } catch (AgeLessThan19Exception e) { // //술, 담배를 살떄 문제 생기는 것에 대한 catch구문 추가
                System.out.println("성인이 되고 난 뒤에 오세요");
            } catch (Exception e) {
            System.out.println("모든 예외를 처리합니다.");
        }
    }
}

//우리가 직접 Exception을 정의해서 throw할 수도 있음 . 위에서 처리를 좀 더 세부적으로 할 수 있음
//Exception을 만들땐 상속을 해줘야함
class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}
package Inflean.chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        //익명클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("----------------");

        //굉장히 친한 친구 방문시.
        // 익명클래스 만들땐 객체 생성시 바로 세미콜론으로 닫지말고
        // 중괄호로 열기. 중괄호 뒤에 세미콜론
        //객체 만들때 order메소드의 기능을 재정의함
        //이 객체 하나만을 위한 일회성 코드.
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("딸기 케이크는 서비스예요");
            }

            @Override
            public void returnTray() {
                System.out.println("자리에 두시면 제가 치울게요");
            }
        };
        specialCoffee.order("바닐라라떼");
        specialCoffee.returnTray();
    }
}

class Coffee {
    public void order( String coffee) {
        System.out.println("주문하신 " + coffee + "나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료되었습니다.");
    }
}

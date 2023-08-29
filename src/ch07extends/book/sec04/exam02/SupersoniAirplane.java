package ch07extends.book.sec04.exam02;

public class SupersoniAirplane extends Airplane {
    //상수 선언
    public static final int NORMAL = 1; // 변수로서 final. 이 변수가 더이상 변하지 않을 것을 말함. 상수와 같은 특징을 지님

    //상태 필드 선언
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    //메소드 재정의
    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        }
        else {
            //Airplane 객체의 fly()메소드 호출
            super.fly();
        }

    }

}

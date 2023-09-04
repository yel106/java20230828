package ch09nested.book.exam10;

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car car = new Car();

        //익명 자식 객체가 대입된 필드 사용
        car.run1();

        //익명 자식 객체가 대입된 로컬 변수 사용
        car.run2();

        //익명 자식 객체가 대입된 매개변수 사용
        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
            }
        });
    }

}

package ch07extends.book.sec08.exam05;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed +=10;
    }


    //final 메소드는 재정의 할 수 없음
//    @Override
//    public void stop() {
//        System.out.println("스포츠 카를 멈춤");
//        speed = 0;
//    }
}

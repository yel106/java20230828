package ch07extends.book.sec08.exam04;

public class Dog extends Animal {
    //Dog이 추상클래스로 남지 않으려면 꼭 메소드 재정의해야함.
    //추상메소드 재정의
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

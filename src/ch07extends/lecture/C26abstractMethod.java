package ch07extends.lecture;

public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath(); //추상메소드가 실행되는게 아니고 실제인스턴스가 실행됨

        Animal26 a2 = new Fish26();
        a2.breath();
    }

}

//추상메소드를 가진 클래스는 꼭 추상 클래스가 되어야 함
abstract class Animal26 {
    //추상 메소드: 몸통이 없는 메소드. 중괄호로 연결되지 않음.
    abstract public void breath();

}

class Dog26 extends Animal26 { //부모클래스가 추상클래스여서 상속받은 클래스는 추상클래스로 만들거나 혹은 추상클래스가 싫고 인스턴스 만들려면 메소드 재정의 해야함
    //추상메소드를 꼭 재정의(오버라이드) 헤야함

    @Override
    public void breath() {
        System.out.println("폐로 숨을 쉽니다.");
    }
}

class Fish26 extends Animal26 {
    @Override
    public void breath() {
        System.out.println("아가미로 숨을 쉽니다.");
    }
}


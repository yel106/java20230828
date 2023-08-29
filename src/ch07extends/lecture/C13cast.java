package ch07extends.lecture;

public class C13cast {
    public static void main(String[] args) {
        Animal13 ani1 = new Dog13(); //
        Animal13 ani2 = new Cat13();

        ani1.breath();
        ani2.breath();



//        ani1.sniff(); //안됨

        //type casting(강제 형 변환) -- 매우 위험
        Dog13 d1 = (Dog13) ani1; //참조변수의 형변환
        d1.sniff(); //ok

        Cat13 c1 = (Cat13) ani2; //형변환 값을 cat에 넣음. 타입은 다르지만 값은 같음. 자식 클래스의 인스턴스 메소드를 실행시키고 싶으면 형변환을 시킴
        c1.hunt(); //ok
    }
}

class Animal13 {
    public void breath() {
        System.out.println("숨쉬다");
    }
}

class Dog13 extends Animal13 {
    public void sniff() {
        System.out.println("냄새 맡다.");
    }
}

class Cat13 extends Animal13 {
    public void hunt() {
        System.out.println("쥐를 잡다");
    }
}
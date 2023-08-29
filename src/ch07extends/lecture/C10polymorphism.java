package ch07extends.lecture;

public class C10polymorphism {
    public static void main(String[] args) {
        Malamute10 dog1 = new Malamute10();
        Chihuahua10 dog2 = new Chihuahua10();

        Canidae10 can1 = dog1; //can1과 dog1은 같은 참조값을 가지고 있음 . 우측 참조값을 좌측에 참조값으로 할당해라
        Canidae10 can2 = dog2;

        Animal10 ani1 = dog1;
        Animal10 ani2 = dog2;      //이 위로 4개는 다 말라뮤트10 인스턴스를 가지고 있음


//        dog1 = ani1; //dog1에 ani1값을 넣는건 안됨

        dog1.breath();
        dog2.breath();

        dog1.cry();
        can1.cry();
        ani1.cry();

        dog2.cry();
        can2.cry();
        ani2.cry();


    }


}
class Animal10 {
    public void breath() {
        System.out.println("숨쉬다");
    }
    public void cry() {
        System.out.println("동물이 운다"); //동물이 우는건 공통적
    }

}

class Canidae10 extends Animal10 {

}

class Malamute10 extends Canidae10 {
    @Override
    public void cry() {
        System.out.println("왕왕");
    }
}

class Chihuahua10 extends Canidae10 {
    @Override
    public void cry() {
        System.out.println("월월");
    }
}
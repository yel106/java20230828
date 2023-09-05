package ch07extends.lecture;

public class A01study {
    public static void main(String[] args) {
        Cat c = new Cat();
        Animal ani = (Animal)c;  //참조변수 ani는 Animal타입임. 참조변수 c의 값을 ani에 대입하려면  조상인 Animal타입으로 형변환해야함 ( 생략가능)
        ani.evolution= "진화";
        ani.genepool= 100;
        ani.run();
        ani.stop();
//        ani.hunt(); //에러. hunt메소드는 호출할 수 없음

        Cat c2 = (Cat)ani;  //참조변수 ani를 c2에 대입하려면 자손인 Cat타입으로 형 변환해야함(생략안됨)
//      human a = (human)c; //상속관계가 아니면 클래스 간의 형 변화는 안됨. 에러




    }
}

class Animal {
    String evolution;
    int genepool;

    void run() {
        System.out.println("달리는 기능");
    }

    void stop() {
        System.out.println("정지 기능");
    }
}

class Cat extends Animal {
    void hunt() {
        System.out.println("쥐를 잡는 기능");
    }
}

class human {

}
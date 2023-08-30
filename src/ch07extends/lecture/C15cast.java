package ch07extends.lecture;

public class C15cast {
    public static void main(String[] args) {


        Animal15 ani1 = new Dog15();
        Animal15 ani2 = new Cat15(); //ani를 cat으로 강제 형변환하는건 안됨


        Dog15 d1 = (Dog15) ani1; //가능
        Cat15 c1 = (Cat15) ani2; //가능

        //강제 형변환에 주의해야하는 이유
        Cat15 c2 = (Cat15) ani1; //불가능. 강제 형변환 시키는거라 문법오류는 아님 . 그런데 실행할 때 문제가 생김.
        Dog15 d2 = (Dog15) ani2; //불가능 ani2가 가리키고 있는건 실제로는 Cat이니까

        Animal15 ani3 = new Animal15();
        Dog15 d3 = (Dog15) ani3; //불가능. 애니몰은 도그라고 하는건 안됨.


        System.out.println("프로그램 실행 계속됨");


    }
}





class Animal15 {

}
class Dog15 extends Animal15 {}

class Cat15 extends  Animal15 {}

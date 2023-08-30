package ch07extends.lecture;

public class C14type {
    public static void main(String[] args) {
        //기본타입
        int a= 3;
        double f = 3.4;



        //참조 타입
        String b= "java"; //변수의 타입은 String

        Object o = "java"; //o라는 변수의 타입은 Object임

        Child c = new Child();
        Parent d = new Child();


    }

}

class Parent {

}
class Child extends Parent {

        }
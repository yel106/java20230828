package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05(); //객체 만들고 생성자 호출  o1에 들어가는게 new MyClass의 참조값. o1인스턴스는 속성(필드)와 기능을 가지고 있음
        MyClass05 o2 = new MyClass05(); //같은 설계도인데 객체가 달라짐 ,알트 쉬프트로 옮김
        System.out.println("o1의 참조값: " + System.identityHashCode(o1));

        o1.age = 30;
        o1.model = "java"; //Myclass 05의 모델을 자바로 바꿈 . 권장하지 않음
        MyClass05.model = "spring;"; //권장 ,

        System.out.println("o1.age = " + o1.age);
        System.out.println("o2. age = " + o2.age);
        System.out.println("o1.model = " + o1.model); //마지막에 덮어쓴게 스프링이라 스프링이 나옴
        System.out.println("o2.model =" + o2.model); //spring
    }

}

class MyClass05 {
 //속성 (필드)
    int age; //instance field


    //static field , class field, 정적필드 라고 함
    static String model;


}



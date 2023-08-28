package ch06class;

public class C01class {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01(); //인스턴스가 들어가는게 아니라 참조값이 들어가는 것임
        System.out.println();
        System.out.println("System.identityHashCode(o1) =" + System.identityHashCode(o1));

        System.out.println("o1.age =" + o1.age); //이 인스턴스는 age라는 속성이 있음

        o1.age = 30; //30으로 바꿈
        System.out.println("o1.age = "+ o1.age);

        MyClass01 o2 = o1; //참조값만 복사된것

        System.out.println("o2.age =" + o2.age);

        o1.age = 60;
        System.out.println("o2.age = " + o2.age);

    }
}


class MyClass01 {
    //instance fields
    //인스턴스가 가져야하는 속성들
    int age;

    String name;




    //instance methods
    //인스턴스가 가져야하는 기능들

}
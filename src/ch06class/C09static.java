package ch06class;

public class C09static {
}

class MyClass09 {

    String name; //instance field

    static String model;  //static field

    void printName() {
        //인스턴스 멤버끼리 접근 가능
        System.out.println("name = " + name);

        //instance 멤버에서 static member 접근가능
        System.out.println("model = " + model);
    }

    //static method

    static void printModel() {
        //static 멤버끼리 접근가능
        System.out.println("model =" + model);

        //static 멤버에서 인스턴스 멤버는 접근 불가능.  이유: 스태틱에서는 인스턴스 멤버 접근 불가능(인스턴스는 클래스(설계도)와 다르게 여러개니까 불명확해서). 반대로는  인스턴스에서는 설계도가 하나니까 접근 가능
//        System.out.println("name = " + name); //오류가 뜸
    }

}

package ch07extends.book.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {

        Child child  =new Child();

        child.method1();
        child.method2();
        child.method3();


        Parent parent = child; //parent도 new Child(); 인스턴스를 가지고 있음

        parent.method1();
        parent.method2();
        //parent.method3(); // 호출 불가능
    }
}

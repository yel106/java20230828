package ch06class;

public class C03class {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        o1.address = "seoul";

        System.out.println("o1.address = " + o1.address); // seoul

        o1 = method1(); // method1의 결과값 p을 o1객체에 넣겠다. o1이 p가 됨  , method1();실행하란 얘기 , =은 오른쪽에 있는값을 왼쪽에 저장한다는 뜻.

        System.out.println("o1.address = " + o1.address); // seoul? jeju?
    }
    public static MyClass03 method1() { //클래스를 반환하겠다고 함.
        MyClass03 p = new MyClass03(); //메소드를 이해해라. method1의 기능 첫번째: Myclass03의 p객체를 만들겠다.
        p.address = "jeju";

        return p;

    }
}

class MyClass03 {
    String address;
}

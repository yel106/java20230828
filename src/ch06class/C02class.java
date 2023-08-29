package ch06class;

public class C02class {
    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();//얘도 빈방
        o1.name = "spring";// 빈방에 넣어줌. 이름은 스프링

        method1(o1); //method1이 네임이라는 방에 자바를 넣어라.는 말  그런데 단칸방. 그래서 하나(자바)가 들어오면 하나(스프링)는 나가야함

        System.out.println("o1.name = " + o1.name); // spring? java?
    }

    public static void method1(MyClass02 p) { //참조 변수로 p이용?? / 예를 들면  String str : String이라는 클래스를 가져와서 str이라는 객체를 받겠다는 뜻 . int a도 마찬가지 . 래퍼클래스
        p.name = "java"; //받아서 p의 name을 java로 바꾸겠다는 뜻                  //모든 클래스는 object라는 조상 클래스를 상속받고 있기 때문에 new 써서 객체 만들지 않고 int a를 쓸수 있는것.
    }
}

class MyClass02 {
    String name; //변수가 방.선언만 하면 빈 방. 값은 없음
}

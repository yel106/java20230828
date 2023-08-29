package ch06class;

public class C08static {
    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08();
        o1.name = "java";
        o1.printName();


        //static member는 클래스 이름으로 바로 접근하세요. 위처럼 o1.name이라고 안해도 됨
        MyClass08.name = "spring"; //이게 권장되는 방법
        MyClass08.printName();

    }
}
class MyClass08 {
    static String name;


    static void printName() {
        System.out.println("name = " + name);
    }
}

package ch06class;

public class C07method {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07();
        MyClass07 o2 = new MyClass07();
        o1.myMethod1();
        o2.myMethod1();

        //줄맞춤 ctrl + alt + l
        o1.name = "java";
        o2.name = "spring";

        o1.printName(); //o1에 있는 name을 실행한것. o1에는 java라고 써져있으니까 java가 나옴
        o2.printName(); //spring 출력

    }
}

class MyClass07 {
    //field
    String name;


    //method
    void printName() {
        System.out.println("name =" + name);
    }

    void myMethod1() {
        System.out.println("Myclass07.myMethod1 실행됨");  //soutn을 사용하면 더 빠르게 할수 있음
    }
}
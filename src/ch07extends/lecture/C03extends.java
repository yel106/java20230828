package ch07extends.lecture;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031();
        o1.printName();
    }
}
//특별한 이유없으면 필드는 private붙임 상속에서 필드는 그렇게 중요하지 않음 왜?
class MyClass03 {
    private  String name; //별일 없으면 private

    void printName() {
        System.out.println("name = " + name);
    }
}

//자식클래스
class MySubClass031 extends MyClass03 {


}

package ch07extends.book.sec08.확인문제;

public class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) {
        super(name); //상위클래스의 생성자를 명시적으로 만들거나 . 상위클래스의 생성자를 직접 만들거나 하면됨
//        this.name= name;
        this.studentNo = studentNo;
    }
}

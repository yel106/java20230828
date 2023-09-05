package ch07extends.lecture;


//생성자가 자동으로 생성되기 때문에 발생하는 문제는?
public class C24constructor {

}

class MyClass24 {

    int age;

    //파라미터 있는 생성자 작성하면
    //파라미터 없는 생성자(기본생성자, 0-args-constrcutor가 자동으로 삽입되지 않는다.
    MyClass24(int age) { //파라미터 int age가 있음
        this.age = age;
    }
}

class MySubClass24 extends MyClass24 {

    //명시적으로 상위 클래스의 생성자 호출 코드 작성해야함
    MySubClass24 () {
        super(30);

    }



}

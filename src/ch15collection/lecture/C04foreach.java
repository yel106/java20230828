package ch15collection.lecture;

import ch09nested.exam04.A;

import java.util.ArrayList;
import java.util.List;

public class C04foreach {
    public static void main(String[] args) {
        List<MyClass04> list = new ArrayList<>();
        list.add(new MyClass04("흥민"));
        list.add(new MyClass04("강인"));
        list.add(new MyClass04("민재"));

        list.forEach(System.out::println); //오브젝트의 투스트링 메소드를 실행하기 떄문에 재정의해줘야함
        //Alt + insert 누르고 toString

    }
}

class MyClass04 {
    @Override
    public String toString() {
        return "MyClass04{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    public MyClass04(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class C03contains {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add(new String("java"));
        list1.add(new String("spring"));


        //contains메소드의 api를 확인하기  : 원래 담고있던 엘리먼트와 새로운 객체에 생성한 엘리먼트가 같은지 확인
        //contains 메소드는 equals 메소드를 활용함. 각 문자열이 같으면 같게 판단하도록 String에서 재정의함
        //Object의 equals는 재정의 안되어있음 . 여기서는 ==의 뜻과 같음
        //Object의 equals(참조값이 같으면 같고, 다르면 false로 나옴) 메소드를 재정의 한적이 없어서 false가 나옴.
        //object의 해쉬코드 메소드를 재정의해야 같다고 나옴 ( Alt + insert 하면 equals & hashcode)
        boolean c1 = list1.contains(new String("java"));
        System.out.println("c1 = " + c1); // false? true?

        List<MyClass03> list2 = new ArrayList<>();
        list2.add(new MyClass03("흥민"));
        list2.add(new MyClass03("강인"));

        boolean c2 = list2.contains(new MyClass03("흥민"));
        System.out.println("c2 = " + c2); // false
    }
}










class MyClass03 {
    private String name;

    public MyClass03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass03 myClass03 = (MyClass03) o;

        return Objects.equals(name, myClass03.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}

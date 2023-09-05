package ch12api.lecture;

public class C02toString {
    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();
        String s1  = o1.toString(); // 이떄는오브젝트 메소드가 실행됨
        System.out.println(s1); //ch12api.lecture.MyClass02@7ba4f24f


        Object o2 = o1;
        System.out.println(o2.toString());
    }
}

class MyClass02 extends Object {
    @Override
    public String toString() {
        return "MyCLass02 객체입니다."; // toString을 재정의한다면? 출력: MyCLass02 객체입니다.
    }
}

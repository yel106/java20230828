package ch07extends.lecture;

public class C06override {
    public static void main(String[] args) {
        MySubClass061 o1 = new MySubClass061();
        o1.method10(); //"자식 클래스의 메소드"
    }

}


class MySubClass061 extends MyClass06 {
    @Override  //이걸 써주면 컴파일시 재정의한 메소드인지 검증할수 있음. 혹시 메소드 이름을 다르게 쓰면 잡을 수 있음. 메소드 이름을 다르게 쓰니까 Override에 붉은색으로 표시됨
    public void method10() {
        System.out.println("자식 클래스의 메소드");
    }
}


class MyClass06 {
    public void method10() {
        System.out.println("부모 클래스의 메소드");
    }
}


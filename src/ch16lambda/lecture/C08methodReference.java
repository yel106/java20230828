package ch16lambda.lecture;

public class C08methodReference {
    public static void main(String[] args) {
        MyClass08 o2 = new MyClass08(); //static이 아닌 인스턴스 메소드는 객체 만들어주고 사용해야함
        MyInterface08 o1 = (x,y) -> o2.otherMethod(x,y);
        MyInterface08 o3= o2::otherMethod;
    }
}

class MyClass08 {
    void otherMethod(int x, int y) { //인스턴스 메소드



    }
}

interface  MyInterface08 {
    void method( int x, int y);
}

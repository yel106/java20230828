package ch16lambda.lecture;

public class C11constructorReference {
    public static void main(String[] args) {
        MyInterface111 o1 = z -> new MyClass11(z);
        MyInterface111 o2 = MyClass11::new;

        MyInterface112 o3= (a,b) -> new MyClass11(a,b);
        MyInterface112 o4 = MyClass11::new;

    }
}



class MyClass11 {
    MyClass11(int a) {

    }

    MyClass11(String a, int b) {}


}

@FunctionalInterface
interface MyInterface111 {
    MyClass11 method(int x); //파라미터가 같다면
}

@FunctionalInterface
interface MyInterface112 {
    MyClass11 someMethod(String x, int y); //추상메소드의 파라미터목록과 클래스의 파라미터가 같으면?
        //생성자 참조로 인스턴스 만들 수 있음
}

package ch07extends.lecture.package1;

import ch07extends.lecture.MyClass30;

public class C31accessModifier {
    public static void main(String[] args) {
        MyClass30 o1 = new MyClass30();
//        o1.privateMethod(); //클래스안이 아니라서 안됨

        o1.publicMethod();
//        o1.packagePrivateMethod(); //같은 패키지가 아니라서 이건 안됨

    }
}

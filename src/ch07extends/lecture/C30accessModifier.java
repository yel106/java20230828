package ch07extends.lecture;

public class C30accessModifier {
    public static void main(String[] args) { //shift + shoift누르면 최근 이용했던 파일 볼수 있음
        // 접근제한자(access modifier)
        // public  : 가장 넓은 범위, 어디서든지 접근 가능
        // protected : 같은 패키지내, 다른 패키지에 있는 상속한(자식) 클래스에서 접근 가능
        // (package private, default) : 같은 패키지내에서만 접근 가능
        // private : 가장 좁은 범위, 클래스 내에서만 접근 가능

        MyClass30 o1 = new MyClass30();
        o1.publicMethod();
//        o1.privateMethod(); // 안됨
        o1.packagePrivateMethod();
        o1.protectedMethod();


    }

}


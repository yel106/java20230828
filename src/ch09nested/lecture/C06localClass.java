package ch09nested.lecture;

public class C06localClass {
    public static void main(String[] args) {
        class LocalClass {


        }

    }


    public static void method1() {
        class LocalClass {

        }

    }

    public void method2() {
        class LocalClass { //메소드 안에서만 쓰려고 내부에 클래스 만듦
            //필드, 생성자, 메소드

        }


        LocalClass o1 = new LocalClass();


    }

}

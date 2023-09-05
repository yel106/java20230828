package ch09nested.lecture;

public class C04access {
    //스태틱에서 인스턴스는 접근가능
    // static member는 instance member에 접근할 수 없다.
    //인스턴스 멤버는 여러개니까 어떤것에 접근할지 몰라서 오류날수 있음

    int instanceField;
    static int staticField;

    static class StaticNestedClass {
        void method() {
//            System.out.println(instanceField); //이건 안됨
            System.out.println(staticField);
        }
    }

    class InnerClass {
        void method1() {
            System.out.println(instanceField); //인스턴스끼리는 외.내부클래스에서 접근가능
            System.out.println(staticField); //인스턴스에서 스태틱은 접근가능

        }

    }


}

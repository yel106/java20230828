package ch09nested.lecture;

public class C07localClass {
    //로컬 클래스에서 사용되는
    //감싸고 있는 메소드의 지역변수는
    //값을 변경할 수 없음 (final, effectively final)
    void method() {
        int value = 0; //한번 할당하면 이 값을 변경할 수 없음.
//        value = 1;
        class LocalClass {
            void method1() {
                System.out.println(value);
            }
        }
    }


    //method2(30);
    void mehtod2(final int param) {
        //파라미터가 local class에서 사용되면
        //파라미터의 값을 변경할 수 없음
//        param= 3; //나중에 바꾸려고 하면 안됨
        class LocalClass {
            void method() {
                System.out.println(param);
            }
        }
    }

}

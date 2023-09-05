package ch08interface.lecture;

public class C14staticMethod {
    public static void main(String[] args) {
        MyInterface14.method(); //public static 메소드 실행. 객체생성 없이 클래스 이름. 뒤에 바로 쓸 수 있음
        MyInterface14.method2();

        //        MyInterface14.common(); //프라이빗은 메소드 내에서만 쓸수 있기때문에 오류남




    }
}

interface MyInterface14 {
    //필드: public static final

    //인스턴스 메소드:
    //추상 메소드
    //default apthem
    //private 메소드

    //static 메소드
    //public static 메소드
    //private static 메소드

    static void method() {
        //안쓰면 public임 public static 메소드
        System.out.println("MyInterface14.method");
        common();

    }

    static void method2() {
        System.out.println("MyInterface14.method2");
        common();
    }

    private static void common() { //공통속성이여서 모아놨는데 공개하고 싶지 않으면  private씀
        System.out.println("어떤 기능1");
    }

}

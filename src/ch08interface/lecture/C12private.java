package ch08interface.lecture;

public class C12private {

}

interface MyInterface12 {
    default void method1() {
        someFeature();
        System.out.println("어떤 기능2");

    }

    default void method2() { //몸통이 없는 추상메서드보다는 처음부터 메서드 안에 내용을 쓰는게 좋으니까 default를 써서 내용을 쓸수 있게 해줌
        //인터페이스에서 따로 프라이빗 안써주면 public void method임
        someFeature();
        System.out.println("어떤 기능3");
    }

    private void someFeature() {  //처음에 디폴트 메소드로 했다가 나중에 숨기고싶어서 프라이빗 메소드로
        // private instance 메소드
        System.out.println("어떤 기능1"); //중복돼서 따로 만들고싶음
    }
}


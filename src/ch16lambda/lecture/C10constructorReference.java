package ch16lambda.lecture;

public class C10constructorReference {
    MyInterface10 o1 = ( )-> {
        return new MyClass10();
    };

    MyInterface10 o2 = ( )->  new MyClass10();

//    MyInterface10 o3 = ( )->  MyClass10::new; //목록까지 같다면 윗 코드를 더 줄일수 있음
}

class MyClass10 {
    MyClass10() {}
}


@FunctionalInterface
interface  MyInterface10 {
    MyClass10 method(); //메소드의 파라미터와 생성자의 ㅍ라미터가 같을떄
}
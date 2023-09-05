package ch07extends.lecture;

public class C22extends {
    MySubClass221 o1 = new MySubClass221();//MySubClass221() 생성자를 호출 할때 상속받은 MyClass22의 생성자를 먼저 호출해야함


}

class MyClass22 {
    MyClass22() {
        //초기화하는 코드들 작성됨...

        System.out.println("상위 클래스 초기화 코드들");

    }
}

class MySubClass221 extends MyClass22 {
    MySubClass221() {
        //상위 클래스 생성자호출(초기화 하는 코드 실행)
        super(); //가장 위에 꼭 있어야함. 안쓰면 자동 삽입. 상위클래스가 먼저 호출된 후에 하위클래스가 호출돼야해서 제일 위에 올라와있어야함

        //MySubClass221 인스턴스 필드 초기화 코드들.....

        System.out.println("하위 클래스 초기화 코드");



    }
}

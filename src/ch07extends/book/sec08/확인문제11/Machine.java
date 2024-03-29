package ch07extends.book.sec08.확인문제11;
// p.333부터 .... 1, 2, 3, 5, 11번 풀기
//1. 답: 1번 , 자바는 다중상속을 허용하지 않음. /3번 더 정확히 하면부모의 private 접근제한을 갖는 필드와 메소드는 자식클래스에서 접근할 수 없음
//2. 2번. 자식객체는 부모타입으로 자동타입 변환되지만, 부모타입은 자동타입변환되지 않는다. 그렇다고 모든 자식타입으로 변환될 수 있는 것은 아니다.
//3. 1번. final 클래스는 부모 클래스로 사용할수 없음. /4번: 상수는 변하지 않는수.PI
//5. 추상클래스 2번. 추상메소드가 있다면 추상클래스가 되어야하는데, 추상클래스라고 해서 추상메소드를 반드시 가져야하는건 아님.

public abstract class Machine {
    public void powerOn() {}
    public void powerOff() {}
    public abstract void word();
}

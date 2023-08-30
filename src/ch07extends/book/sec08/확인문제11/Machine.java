package ch07extends.book.sec08.확인문제11;
// p.333부터 .... 1, 2, 3, 4, 11번 풀기
//1. 4번. final 클래스 상속은 할 수 있다?
//2. 2번. 자식객체는 부모타입으로 자동타입 변환되지만, 부모타입은 자동타입변환되지 않는다. 그렇다고 모든 자식타입으로 변환될 수 있는 것은 아니다.
//3. 3번 . 재정의 할 수 있다.
//5.
public abstract class Machine {
    public void powerOn() {}
    public void powerOff() {}
    public abstract void word();
}

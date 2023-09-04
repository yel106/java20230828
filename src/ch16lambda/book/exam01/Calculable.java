package ch16lambda.book.exam01;

@FunctionalInterface //추상메소드가 하나인 인터페이스
//이 인터페이스가 추상메소드가 하나인지 컴파일러를 통해 검증
//실수로 추상메소드를 하나 더 만들면 에러가 뜸
//디폴드 메소드를 추가로 만드는건 상관없음
public interface Calculable {
    void calculate(int x, int y); //추상메소드 하나.
}

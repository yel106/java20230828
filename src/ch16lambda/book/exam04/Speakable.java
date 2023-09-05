package ch16lambda.book.exam04;

@FunctionalInterface
public interface Speakable {
    void speak(String content); // parameter는 꼭 인터페이스 명과 같지 않아도 됨
}

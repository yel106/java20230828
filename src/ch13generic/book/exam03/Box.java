package ch13generic.book.exam03;

public class Box <T>{
    //필드
    private T t;

    //getter메소드

    public T get() {
        return t;
    }

    //setter 메소드
    public void set(T t) {
        this.t = t;
    }
}

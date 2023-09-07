package ch13generic.book.확인문제3;

public class Container<T, T1> {
    private T Key;
    private T1 Value;

    public T getKey() {
        return Key;
    }

    public T1 getValue() {
        return Value;
    }

    public void set(T key, T1 value) {
        this.Key = key;
        this.Value = value;
    }




}

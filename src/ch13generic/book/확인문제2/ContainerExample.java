package ch13generic.book.확인문제2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
    }
}

class Container<T> {
    private T field;
    public void set(T p) {
        this.field = p;
    }

    public T get() {
        return field;
    }
}

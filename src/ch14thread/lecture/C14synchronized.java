package ch14thread.lecture;

public class C14synchronized {




}

class Task14 implements Runnable {
    private MyBox14 box;

    public Task14(MyBox14 box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            box.increment();
        }
    }
}

class MyBox14 {
    private int value;

    public MyBox14(int value) {
        this.value = value;
    }

    // synchronized method
    public synchronized void increment() {
        // monitor lock 은 this
        value++;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


//synchronized block과 다르게 synchronized method로 만들수도 있음.
// public synchronized void increment() 라고 메서드 자체에 synchronized 하게 되면 클래스로 만들어진 객체를 두고 경쟁함
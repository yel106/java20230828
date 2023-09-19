package ch14thread.lecture;

public class C13synchronized {
    public static void main(String[] args) throws InterruptedException {
        MyBox box = new MyBox(0);
        Thread t1= new Thread(new Task(box));
        t1.start();

        Thread t2 = new Thread(new Task(box));
        t2.start();

        t1.join();
        t2.join(); //숫자가 크면 쓰레드를 왔다갔다하다가 잘못된 값을 출력할수 있음.
        System.out.println("box.getValue() = " + box.getValue()); // 만번 더한 다음에 조인하고 값을 가져옴
    }
}

class Task implements Runnable {
    
    private MyBox box;

    
    //Box를 받는 생성자
    public Task(MyBox box) {
        this.box = box;
    }

    @Override
    public void run() { //재정의해야함
        for (int i = 0; i < 10000; i++) {
            box.increment();
        }
    }
}



class MyBox {
    private int value;

    //monitor lock
    private Object lock = new Object();

    public MyBox(int value) {
        this.value = value;
    }
    
    public void increment(){

        //synchronized block
        synchronized (lock) { //하나의 객체를 두고 경쟁해야돼서 new Object() 라고 쓰면 안됨
            //여러쓰레드가 접근하지 못하도록 함. 괄호에는 객체가 들어감
            //여러 쓰레드가 이 코드 블럭에 진입하려고 할 떄 os에게 이 객체를 먼저 얻은 쓰레드만 블럭에 진입하도록 함.
            //다른 곳에 value++ 업무를 넘겨주기 전에 끝낼 수 있음. 어떤 쓰레드가 이 코드 블럭을 잘 실행했다면 lock을 반납하게 됨
            //그럼 다른 애들이 얻을수 있는 기회가 생겨서. 쓰고 반납하는 식으로  하기떄문에 synchronized 안에 있는것은 안전하게 사용가능
            value++;
        }
    }
    

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

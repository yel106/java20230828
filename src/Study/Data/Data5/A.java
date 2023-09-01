package Study.Data.Data5;

public interface A {
    void water();

    void run();

    default void stop() {
        System.out.println("멈추는 기능");
    }
}

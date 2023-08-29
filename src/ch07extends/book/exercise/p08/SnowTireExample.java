package ch07extends.book.exercise.p08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        tire.run();
        snowTire.run(); //실제 인스턴스에 있는 스노우 타이어가 출력됨.

    }
}

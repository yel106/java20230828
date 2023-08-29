package ch07extends.book.sec04.exam02;

public class SupersonicAirPlaneExample {
    public static void main(String[] args) {
        SupersoniAirplane sa = new SupersoniAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersoniAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersoniAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}

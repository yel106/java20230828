package ch16lambda.book.exam06;

public class Computer {
    public static double staticMethod(double x, double y) { //스태틱 메소드
        return x+y;
    }

    public double instanceMethod(double x, double y) { //인스턴스 메소드
        return x+y;
    }

}

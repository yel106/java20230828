package ch11exception.lecture;

public class C02exception {
    public static void main(String[] args) {
        System.out.println("code1...");
        System.out.println("code2...");

        int[] arr= {1, 2};
        int i = arr[2];  // indexOfBoundException 길이를 초과한 예외


        System.out.println("code3...");

    }
}

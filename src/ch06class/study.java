package ch06class;

public class study {
    public static void main(String[] args) {
        Studying studying1 = new Studying();
        Studying studying2 = new Studying();


        studying1.name = "java";
        System.out.println(studying1.name);

        studying1.number = 35;
        System.out.println(studying1.number);

        //static member는 클래스 이름으로 바로 접근
        Studying.st();

    }
}
class Studying {
    String name;

    static int number;
    static String address;

    static void st() {
        number= 30;
        System.out.println("30이라고 출력  :" + number);

        //static이 아닌 필드는 static메소드에서 부를 수 없음
//        name = "예린";

        //static인 address는 부를 수 있음
        address = "인천시";


    }



}
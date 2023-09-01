package ch08interface.lecture;

public class C13field {
    public static void main(String[] args) {
        System.out.println(MyInterface13.VALUE);
        System.out.println(MyInterface13.NAME);
        System.out.println(MyInterface13.HOME_ADDRESS);
    }
}


interface  MyInterface13 {

    int VALUE =20; //public static final 값을 한번 받을 기회를받음. 대문자로 쓰면 변수명만 봐도 파이널이라는 걸 알수있음. 약속한것
    public static final String NAME = "java";
    String HOME_ADDRESS = "seoul";
}
package Study.Data.Data2;

public class Data2 {
    int x;
}

class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d); //d값이 밑에 Data2 d에 대입됨
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) { // 데이터타입이 기본형이 아니고 Data2니까  참조형 매개변수
        d.x= 1000; //참조변수 d가 가리키는 x의 값을 1000으로 바꿈
        System.out.println("change() : x " + d.x);
    }
}

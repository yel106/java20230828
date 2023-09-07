package inflearn.ch_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열: '같은' 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + "하나" ); //아메리카노 하나
        System.out.println(coffeeRachel + "하나" );
        System.out.println(coffeeChandler + "하나" );
        System.out.println(coffeeMonica + "하나" );
        System.out.println("주세요" );

        //배열선언 첫번째 방법
//        String[] coffees = new String[4]; //의자를 4개 만들었다고 생각

        //배열선언 두번째 방법
//        String coffees1 [] = new String[4]; //대괄호를 배열명 뒤에 놓을 수도 있음

//        배열을 선언했으면 이제 그 의자의 어디에 앉을지를 정해줘야함
//        어느 위치에 넣을지 정하기 위해서는 대괄호 사용[] 안에 위치값(인덱스 값)을 넣어줌
//        인덱스 값은 0부터 시작
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";


        //세번째 방법: 배열 선언함과 동시에 값 초기화하기
//        String [] coffees= new String[] {"아메리카노", "카페모카" , "라떼", "카푸치노" };

        //네번쨰 방법
        String [] coffees= {"아메리카노", "카페모카" , "라떼", "카푸치노" };
        System.out.println("--------------------");


        //커피 주문
        System.out.println(coffees[0] + "하나"); //아메리카노 하나
        System.out.println(coffees[1] + "하나"); //카페모카 하나
        coffees[2] = "에스프레소"; //값 변경
        System.out.println(coffees[2] + "하나"); //라떼 하나
        System.out.println(coffees[3] + "하나"); //카푸치노 하나
        System.out.println("주세요");

        //다른 자료형?
        int [] price = new int[3];
        price[0] = 3500;
        price[1] = 5500;
        price[2] = 4000;

        System.out.println(price[0]);

        double [] d = new double[] {10.0, 13.4, 16.1, 40.1};
        boolean[] b = {true, false, true};


    }
}

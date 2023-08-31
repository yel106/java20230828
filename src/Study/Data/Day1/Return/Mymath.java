package Study.Data.Day1.Return;

class Mymath {
    public static void main(String[] args) {
        MySubmath mySubmath = new MySubmath();
//        mySubmath.printGugudan(8); //입력값을 써줘야함
        mySubmath.max(4,1);
    }
}

class MySubmath {
    void printGugudan(int dan) {
        if(!(2<=dan && dan <=9))
            return; //입력받은 단이 2~9단이 아니면 메서드 종료

        for(int i=1; i<=9; i++) {
            System.out.printf("%d * %d = %d%n" ,dan, i, dan*i );

        } return; //여기서의 리턴문은 생략된 것 . 원래는 있어야함

    }
    //두 값을 받아서 둘중 큰 값을 반환하는 메서드
    long max(long a, long b) { //long타입의 값을 반환하라
        if(a>b)         //아래 else를 안쓰면 if문의 내용이 참일때만 실행됨
            return a;
        else
            return b; //조건이 거짓일 때 실행
    }


    int add(int x, int y) {  //int와 아래 result의 타입이 일치해야함
        int result = x+y;  //int는 char, byte, short와 자동형변환될 수 있음
        return result;
    }

    //윗 문장을 더 간단하게 쓰면
//    int add(int x, int y) {
//        return  x+y;
//    }



}


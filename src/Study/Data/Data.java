package Study.Data;

public class Data {
    int x;
}

class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data(); //참조변수 d생성. Data객체 생성. data의 값이 d에 저장됨
        d.x = 10; //10을 x에 대입
        System.out.println("main() : x = " + d.x);

        change(d.x); //d.x의 값 10이 change메소드의 int x로 들어감
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

        static void change(int x) {  //기본형 매개변수: 읽기만 가능. main에 있는 x값을 바꿀수는 없다.
                        //읽고 값까지 바꾸려면 참조형 매개변수를 써야함
        x= 1000;       //x는 지역변수( 이 함수 밖에서는 사용되지 못하고 끝남)
            System.out.println("change() : x = " + x);

        }
    }


package Study.Data.Data3;

//참조형 반환타입
public class Data3 {
    int x;
}
class Ex6_8 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d); //변수의 타입과 copy메소드의 반환타입이 Data3로 일치해야함
        //copy(d) 앞에 참조변수가 없는이유는 static메소드라서 그런것도 있고
        // 같은 클래스에 있기 때문에 이런경우는 참조변수를 생략가능하다.
        //static메소드는 객체의 생성없이 호출이 가능하다.
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x=" + d2.x);
    }

    static Data3 copy(Data3 d) { //메소드의 반환타입이 Data3 참조형 반환타입임
                        //반환타입이 참조형이면 객체의 주소를 반환함
        Data3 tmp = new Data3(); //새로운 객체 tmp를 생성한다.

        tmp.x = d.x; //d.x의 값을 tmp.x에 복사한다.

        return tmp; //복사한 객체의 주소를 반환한다.
                //이 반환한 값이 위에 copy(d)에 들어간다.
        //반환타입이 참조형이라는 것은. 주소를 반환한다는 것

        //
    }
}
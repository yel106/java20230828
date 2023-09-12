package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        try {
            //ClassCastException
            // NullPointerException
            //ArithmeticException

        } catch( RuntimeException e) {
            // NullPointerException
            //ArithmeticException의 상위타입인 런타임으로 씀
        }

//        } catch ( ClassCastException e) { //ClassCastException는 별도로 처리하려고 했더니 오류가 남
            // ClassCastException은 RuntimeException에서 잡히기 떄문에 따로 할수 없음. 쓸데없이 쓴다고 알려줌
            // 쓰고 싶다면 순서를 바꿔줘야함 > catch( RuntimeException e)위에 먼저 쓰기
        //상위타입으로 Exception작성하려면 순서 주의해서 작성
//        }

    }
}

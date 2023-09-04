package ch16lambda.book.exam01;

public class LambdaExample {
    public static void main(String[] args) {
//        action(new Calculable() {
//            @Override
//            public void calculate(int x, int y) {
//                int result = x + y;
//                System.out.println("result = " + result);
//            }
//        });

        //위 식을 람다식으로 변경
        action((x, y) -> {         //추상 메소드에서 int x, int y라고 해서 자료형을 알려줬기때문에 생략가능
            int result = x + y;
            System.out.println("result = " + result);
        });

       action ((x,y) -> System.out.println(x +y));



        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result = x - y;
                System.out.println("result = " + result);
            }
        });
    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}

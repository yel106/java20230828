package ch16lambda.book.확인문제7;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
            result = (result< score) ? score : result; //삼항연산
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값 얻기. 여러가지 방법이 있음
//        int max = maxOrMin((x, y) -> (x < y) ? y : x); //삼항연산


//    int max =maxOrMin((x, y) -> {
//                if (x > y) {
//                    return x;
//
//                } else {
//                    return y;
//                }
//            });


int max = maxOrMin((x, y) -> Math.max(x,y));
        System.out.println("최대값: " + max);


//        int max = maxOrMin(new Operator() {
//            @Override
//            public int apply(int x, int y) {
//                return Math.max(x, y);
//            }
//        });





        //최소값 얻기
//        int min = maxOrMin((x, y) -> Math.min(x, y));
        int min = maxOrMin(Math::min);
        System.out.println("최소값 = " + min);


    }
}
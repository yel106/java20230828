package ch18io.lecture;

public class C24varargs { //variable arguments
    public static void main(String[] args) {
        //varargs(가변 인자) :
        method1(3);
        method1(5, 6);
        method1(new int[] {10,20, 30});
        //var args가 없던 시절에는 변수를 여러개 받고 싶으면 배열로 넣어서 했었음

        //가변인자 이후. 오버로딩 없이도 인자를 여러개 넣을수 있게 됨
        method2();
        method2(2);
        method2(3, 4);
        method2(6, 7, 8, 9, 10);

    }

    public static void method3( Double d, String s, int... args) {
        //사용시 주의할 점 : 파라미터 목록 마지막에만 작성 가능.
        // 중간이나 처음에 들어가면 안됨. ...은여러개 들어간다는 뜻이라서 중간에 들어가면 안됨


    }


    //가변인자 이후
    public static void method2(int... nums) {
        //가변인자 사용법
        // :배열로 사용하면 됨

        for( int i=0; i< nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
        }
    }


    public static void method1(int a ){

    }

    public static void method1(int a, int b) {

    }

    public static void method1(int[] arr) {

    }



}

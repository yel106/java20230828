package ch12api.lecture;

public class C20wrapper {
    public static void main(String[] args) {
        //wrapper class: 기본타입을 감싸고 있는 클래스
        //기본타입: byte, short, int, long, float, double, char, boolean
        //wrapper class : Byte, Short, Integer, Long, Float, Double, Character, Boolean

        //기본타입 -> 참조타입: 박싱
        //기본타입 <- 참조타입: 언박싱

        //boxing
        int i = 500;
//        Integer j = new Integer(i);//권장되지 않는 방법
        Integer k = Integer.valueOf(i); //boxing
        System.out.println(i);
//        System.out.println(j);
        System.out.println(k);

        //unboxing
        Integer l = Integer.valueOf(1000);
        int m = l.intValue(); //unboxing

        System.out.println(l);
        System.out.println(m);

        //auto boxing
        int n = 777;
//        Integer o = Integer.valueOf(n);

        Integer o = n; //auto boxing

        //auto unboxing
        Integer p = Integer.valueOf(888);
        int q =p;



    }
}

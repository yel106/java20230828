package ch12api.lecture;

public class C22wrapper {
    public static void main(String[] args) {
        Integer i = 3000;
        Integer j = 3000;

        int k = 30;
        int l = 30;

        System.out.println(k==l);
        System.out.println(i==j); //참조값은 다르기 떄문에 false가 나옴

        System.out.println(System.identityHashCode(i));
        System.out.println(System.identityHashCode(j)); //참조값이 다름

        //참조값 비교시 equals사용
        System.out.println(i.equals(j));

    }
}

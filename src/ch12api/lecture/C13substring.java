package ch12api.lecture;

public class C13substring {
    public static void main(String[] args) {
        //substring : 부분 문자열 추출
        String a = "spring";


        String sub1= a.substring(0,2); //0번부터 시작, 시작 인덱스는 포함되는데 마지막은 포함 안됨. 1번까지만 나옴
        System.out.println(sub1); //sp

        String sub2= a.substring(2,5);
        System.out.println(sub2); //rin

        System.out.println(a.substring(2)); // 끝까지 나오게 하고싶으면 시작점만 하나쓰면 끝까지 나옴
        System.out.println(a.substring(0));


    }
}

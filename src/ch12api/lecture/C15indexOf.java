package ch12api.lecture;

public class C15indexOf {
    public static void main(String[] args) {
        //indextOf: 특정 문자열이 시작하는 위치(index) 리턴
        //값이 없으면 -1을 리턴함
        String a = "spring";

        int index = a.indexOf("ring"); //2
        System.out.println(index);

        System.out.println(a.indexOf("pr")); //1

        String b = "spring is spring";
        System.out.println(b.indexOf("ring")); //2가 나옴. ring이 두번나오는데 처음나오는것을 출력함

        int index1 = b.indexOf("ring", 2); //2.  (찾을 문자열, 시작하는 점)
        System.out.println(index1);

        int index2 = b.indexOf("ring", 3); //2.
        System.out.println(index2);
    }
}

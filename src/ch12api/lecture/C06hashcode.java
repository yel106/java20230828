package ch12api.lecture;

public class C06hashcode {
    public static void main(String[] args) {

        String o1 = new String("java");
        String o2 = new String("spring");
        String o3 = new String("java");

        System.out.println(o1== o2); //false
        System.out.println(o1.hashCode()); //false
        System.out.println(o2.hashCode()); //false

        System.out.println(o1== o3);
        System.out.println(o1.hashCode());
        System.out.println(o3.hashCode()); //오브젝트의 해쉬코드 메소드를 재정의 했기 때문에 다르게 나옴
        //api를 참고 해보면 "java" 각 위치에 있는 문자와 문자갯수가 같으면 객체의 해쉬코드 매소드와 상관없이 해쉬코드가 같게 나옴
        //서로 다른객체여도 같은값이 나올수 있음 . 필수는 아니라서 스트링에서는 다른객체여도 같은 문자열이면 같게나옴

    }
}

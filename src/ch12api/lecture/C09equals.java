package ch12api.lecture;

public class C09equals {
    public static void main(String[] args) {
        Object o1= new String("java");
        Object o2= new String("spring");
        Object o3= new String("java");

        System.out.println(o1==o2); //false, 서로 다른 인스턴스니까
        System.out.println(o1 ==o3); //false

        System.out.println(o1.equals(o2)); //false
        System.out.println(o1.equals(o3)); //true 문자는 java로 같으니까 트루가 나옴 . String 비교는 equals를 사용해라


    }
}

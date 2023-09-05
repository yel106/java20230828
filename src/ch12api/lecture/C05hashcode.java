package ch12api.lecture;

public class C05hashcode {
    public static void main(String[] args) {
        Object o1  = new Object();
        Object o2 = new Object();
        Object o3 = new Object();


        int hashCode1 = o1.hashCode();//객체가 다르면 서로 다른 값을 리턴함
        int hashCode2 = o2.hashCode();
        int hashCode3 = o3.hashCode();

        System.out.println(hashCode1);
        System.out.println(hashCode2);
        System.out.println(hashCode3);
        System.out.println(hashCode3); //같은 객체에서는 같은 해쉬코드가 나옴



        Object o4 = o3; //o4는 o3의 해쉬코드를 갖고 있으니까 같은게 나옴
        System.out.println(o4.hashCode());
    }
}



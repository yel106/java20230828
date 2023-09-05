package ch12api.lecture;

public class C01object {
    public static void main(String[] args) {
        //objcet
        //모든 클래스의 상위 클래스
        //모든 타입의 상위 타입
        String s = "java";
        Object o1 = s;
        o1.toString(); //오브젝트 메소드가 아닌 실제 인스턴스 메소드가 가지고 있는 string이 실행됨

        Integer i = 3;
        Object o2= i;
        o2. toString();

        C01object c  = new C01object();
        Object o3 = c;
        o3.toString();


        int j = 30;
        Object o4 = j;


    }
}


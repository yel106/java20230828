package ch13generic.lecture;

public class C01before {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.setA("java");

        MyClass01 o2 = new MyClass01();
        o2.setA(3);

        MyClass01 o3 = new MyClass01();
        o3.setA(true);

        Object f1 = o1.getA(); //오브젝트 타입 변수로 받아보자
        Object f2 = o2.getA(); //오브젝트 타입으로 받아보자
        Object f3 = o3.getA(); //오브젝트 타입으로 받아보자

        //get으로 받을때 형변환을 해야함.
        String g1 = (String ) f1;
        Integer g2 = (Integer) f2;
        Boolean g3 = (Boolean) f3;

        //만약 개발자가 실수를 한다면?
        Long g4 = (Long) f2; //오류가 발생함
        //그래서 이러한 오류를 방지하기 위해 제네릭임

        System.out.println("프로그램 진행");

    }
}

class MyClass01 {
    private Object a;

    public void setA(Object a) {
        this.a = a;
    }

    public Object getA() {
        return a;
    }
}

package ch13generic.lecture;

public class C04generic {
    public static void main(String[] args) {
        MyClass04<String> o1 = new MyClass04<>();
        o1.setField("java");
//        Object f1 = o1.getField(); //Object f1변수로 받으면 보통 형변환해야하는데 제네릭은 않도 됨
        String f1 = o1.getField();

        MyClass04<Integer> o2 = new MyClass04<>();
        o2.setField(3000);

        //자동 박싱, 언박싱됨
        Integer f2= o2.getField();
        int f22 = o2.getField();

        MyClass04<Long> o3 = new MyClass04<>();
        o3.setField(50000L);
        Long f3 = o3.getField();
        long f33 = o3.getField();


    }
}

class MyClass04 <T> {
    private T field;

    public void setField(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }


}
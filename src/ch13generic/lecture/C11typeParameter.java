package ch13generic.lecture;

public class C11typeParameter {
    public static void main(String[] args) {
        MyClass11<Animal> o1 = new MyClass11<Animal>();
        MyClass11<Dog> o2 = new MyClass11<Dog>();
        MyClass11<Cat> o3 = new MyClass11<Cat>();

    }
}

class MyClass11<T extends Animal> { //T를 애니몰의 하위타입으로 제한함 . param.animalMethod(); 메소드 안전하게 호출하려고
    public void method(T param) {
        param.equals(null);
        param.toString();
        param.hashCode();
        param.animalMethod(); //C06에서 만들었던 메소드를 활용


    }
}

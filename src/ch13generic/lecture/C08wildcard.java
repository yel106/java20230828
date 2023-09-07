package ch13generic.lecture;

public class C08wildcard {
    public static void main(String[] args) {
        MyClass08<?> o1 = new MyClass08<Animal>(); // ?는 T가 아무거나 돼도 된다는 뜻
        MyClass08<?> o2 = new MyClass08<Dog>();
        MyClass08<?> o3 = new MyClass08<Cat>();
        MyClass08<?> o4 = new MyClass08<Object>(); //object가 가지고 있는 것을 쓰고 싶어서 ?를 쓴것

        o1.equals(null);
        o2.toString();
        o3.hashCode();

//        MyClass08<Object> o5 = new MyClass08<Dog>(); //이게 안됨 . 그래서 ?를 쓰는것


    }

    public void otherMethod() {
        someMethod(new MyClass08<Object>());
        someMethod(new MyClass08<Animal>());
        someMethod(new MyClass08<Dog>());
        someMethod(new MyClass08<Cat>());
    }


    public void someMethod(MyClass08<? > param) {
        param.hashCode();
        param.equals(null);
        param.toString();
    }
}

class MyClass08<T> {

}

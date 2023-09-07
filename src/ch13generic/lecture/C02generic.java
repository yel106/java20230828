package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>(); //T에 Object를 넣은것
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();
//        MyClass02<int> o5 = new MyClass02<>(); //참조타입만 가능

        MyClass02<Object> o6 = new MyClass02<>();  // 뒤의 <>는 생략 가능
        MyClass02<String> o7 = new MyClass02<>();  // 뒤의 <>는 생략 가능
        MyClass02<Integer> o8 = new MyClass02<>();  // 뒤의 <>는 생략 가능
        MyClass02<Boolean> o9 = new MyClass02<>();  // 뒤의 <>는 생략 가능




    }
}


// generic type . <T> : type parameter. 결정하지 않은 타입을 나중에 받겠다는 뜻
// 참조타입만 가능. int는 안됨
class MyClass02<T>{
    private T a; //T에 넣는 값에 따라서 Object , String, Integer모두 가능

}

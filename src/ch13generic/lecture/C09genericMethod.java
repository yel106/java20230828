package ch13generic.lecture;

public class C09genericMethod {
    public static void main(String[] args) {
      MyClass09 o1 = new MyClass09();
      o1.<Object> method(new Object());
      o1.<String>method("java"); //호출할때 T가 String이 됨

      o1.method(new Object());
      o1.method("java");

      String s = o1.<String> method1();
      Object o = o1.<Object>method1();

      String t = o1.method1();
      Object u = o1.method1();



    }
}

class MyClass09 {
    //generic method
    public <T> void method(T param) {

    }

    public void method(String param) {

    }

    public <T> T method1() { //리턴 타입이 있으면 꼭 return해야함
        return null;
    }
}

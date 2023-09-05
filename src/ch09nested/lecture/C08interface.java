package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        class ConcretelCLass implements MyClass08.NestedInterface {

            @Override
            public void method2() {
                System.out.println("ConcretelCLass.method2");
            }
        }
    }
}
class MyClass081 implements MyClass08.NestedInterface {

    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}

class MyClass08 {
    interface NestedInterface {
        //public abstract instance method(***************)
        void method2();
        //public final static field
        //private instance method
        //default instance method
        //public static method
        //private static method
    }

    void mehtod1( ) {
        class ConcreteClass implements NestedInterface {

            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }
        ConcreteClass c = new ConcreteClass();
        c.method2();
    }
}

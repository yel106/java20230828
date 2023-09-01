package ch08interface.book.exam11;

public class C implements A{
    @Override
    public void method1() {
        System.out.println("C- method1()");
    }

    //메소드 2추가로 만듦
    public void method2() {
        System.out.println("C-method2()");
    }
}

package ch09nested.lecture;

public class C05access {
    String name = "java";   // 외부클래스의 name과 내부클래스의 name이 같은경우 어떻게 접근?

    class InnerClass {
        String name = "spring";

        void method() {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(C05access.this.name); //외부 클래스의 name에 접근하기 위한 방법
        }
    }

    public static void main(String[] args) {
        C05access o2 = new C05access();
        InnerClass o1 = o2.new InnerClass();
        o1.method();
    }
}

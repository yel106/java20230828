package ch11exception.lecture;

public class C08finally {
    public static void main(String[] args) {
        try {
            System.out.println("코드 실행");
            return;
        } finally {
            System.out.println("무조건 실행해야하는 코드"); //catch블럭 없이 사용되기도 함
        }

    }
}

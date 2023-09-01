package Study.Data.Data4;

public class B implements A{

    @Override
    public void run() {
        System.out.println("달린다.");
    }

    @Override
    public void walk() {
        System.out.println("걷는다.");
    }
}

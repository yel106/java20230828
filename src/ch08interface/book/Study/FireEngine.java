package ch08interface.book.Study;

public class FireEngine implements Car{
    @Override
    public void A() {
        System.out.println("물을 뿌립니다.");
    }

    @Override
    public void B() {
        System.out.println("구급장비가 있습니다");
    }
}

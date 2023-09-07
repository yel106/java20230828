package ch13generic.book.exam02;

//제네릭 타입
public class Product <K,M> {
    //필드
    private K kind;
    private M model;

    //메소드

    public K getKind() {
        return this.kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return this.model;
    }

    public void setModel(M medel) {
        this.model = model;
    }
}
